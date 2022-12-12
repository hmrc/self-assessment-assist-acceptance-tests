/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.CreateTestUser._
import uk.gov.hmrc.integration.cucumber.utils.json.JsonTools

import scala.util.Random

object AuthLoginApi extends JsonTools {

  def createLocalTestUserWithAuthLoginApi(affinityGroup: String,
                                          clientEnrolled: Boolean = true,
                                          agentEnrolled: Boolean = true,
                                          invalidMtditid: Boolean = false): TaxPayer = {

    //  Call to api-platform-test-user /create-test-user for Client
    val clientCreateTestUser: String =
      if (affinityGroup.equals(AffinityGroup.Agent)) createTestUser(AffinityGroup.Individual)
      else createTestUser(affinityGroup)

    val nino: String = retrieveJsonValue(clientCreateTestUser, "nino")
    val mtditid: String =
      if (invalidMtditid) randomMtditid
      else retrieveJsonValue(clientCreateTestUser, "mtdItId")

    // Call to api-platform-test-user /create-test-user if Agent
    val agentReferenceNumber: String =
      if (affinityGroup.equals(AffinityGroup.Agent)) retrieveJsonValue(createTestUser(affinityGroup), "agentServicesAccountNumber")
      else ""

    // Call to auth-login-api /government-gateway/session/login
    val authBody: String =
      Json.parse(createAuthLoginApiRequestBody(affinityGroup, nino, mtditid, agentReferenceNumber, clientEnrolled, agentEnrolled)).toString
    val authResponse = getHttpWithTimeout(authLoginApiUrl).postData(authBody).headers(contentTypeHeader).asString
    withClue(
      "\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
        s"\n\nCALL TO AUTH FAILED\n\nurl: $authLoginApiUrl\n\nbody:\n${Json.prettyPrint(Json.parse(authBody))}" +
        "\n\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n\n") {
      authResponse.code shouldBe 201
    }

    if (printConfig)
      println(
        s"$authLoginApiUrl\n\nbody:\n${Json.prettyPrint(Json.parse(authBody))}" +
          s"\nAuthResponse: $authResponse\n")

    val accessToken: String = authResponse.header("Authorization").get

    val newTaxPayer: TaxPayer =
      if (affinityGroup.equals(AffinityGroup.Agent)) TaxPayer(nino, mtditid, accessToken, Some(agentReferenceNumber))
      else TaxPayer(nino, mtditid, accessToken, None)

    newTaxPayer
  }

  def createAuthLoginApiRequestBody(affinityGroup: String,
                                    nino: String,
                                    mtditid: String,
                                    agentReferenceNumber: String,
                                    clientEnrolled: Boolean = true,
                                    agentEnrolled: Boolean = true): String = {
    val body =
      /** Non-agents
        * ----------
        */
      // Enrolled Non-agent
      if (clientEnrolled && !affinityGroup.equals(AffinityGroup.Agent)) {
        mainBody(nino, affinityGroup, CredentialRole.User, mtdSaEnrolment(mtditid), "[]")
      }
      // Not enrolled Non-agent
      else if (!clientEnrolled && !affinityGroup.equals(AffinityGroup.Agent)) {
        mainBody(nino, affinityGroup, CredentialRole.User, "[]", "[]")
      }

      /** Agents
        * ------
        */
      // Enrolled Agent with enrolled client
      else if (agentEnrolled && clientEnrolled && affinityGroup.equals(AffinityGroup.Agent)) {
        mainBody(randomNino, affinityGroup, CredentialRole.Admin, agentEnrolment(agentReferenceNumber), mtdSaDelegatedEnrolment(mtditid))
      }
      // Not enrolled Agent with enrolled Client
      else if (!agentEnrolled && clientEnrolled && affinityGroup.equals(AffinityGroup.Agent)) {
        mainBody(randomNino, affinityGroup, CredentialRole.Admin, "[]", mtdSaDelegatedEnrolment(mtditid))
      }

    body.toString
  }

  def postNinoBodyForLocalTesting: String =
    s"""
      |{
      |  "nino": "AA000000",
      |  "ninoSuffix": "C",
      |  "names": {
      |    "1": {
      |      "sequenceNumber": 12345,
      |      "firstForenameOrInitial": "Jane",
      |      "secondForenameOrInitial": "A",
      |      "surname": "Doe",
      |      "startDate": "2001-02-02"
      |    } },
      |  "sex": "F",
      |  "dateOfBirth": "1987-02-20",
      |  "deceased": false,
      |  "addresses": {
      |    "1": {
      |      "line1": "1 Oxford Road",
      |      "line2": "Town Centre",
      |      "line3": "London",
      |      "line4": "London",
      |      "line5": "England",
      |      "postcode": "NW2 3CD",
      |      "countryCode": 1,
      |      "sequenceNumber": 1,
      |      "startDate": "2001-02-02"
      |    }
      |  },
      |  "phoneNumbers": {
      |    "1": {
      |      "telephoneNumber": "01999123459",
      |      "telephoneType": 1
      |    }
      |  },
      |  "accountStatus": 0,
      |  "manualCorrespondenceInd": false,
      |  "dateOfEntry": "2001-02-02",
      |  "dateOfRegistration": "2001-02-02",
      |  "registrationType": 0,
      |  "hasSelfAssessmentAccount": false,
      |  "audioOutputRequired": false,
      |  "brailleOutputRequired": false,
      |  "largePrintOutputRequired": false,
      |  "welshOutputRequired": false
      |}
      """.stripMargin
  def authTokenGeneratorBodyForLocalTesting: String =
    s"""
      |{
      |	"credId": "123456789",
      |    "affinityGroup": "Individual",
      |    "confidenceLevel": 200,
      |    "credentialStrength": "strong",
      |    "nino": "$validNinoForLocalTesting",
      |	"enrolments": []
      |}
      """.stripMargin

  def authTokenGeneratorBodyWithInvalidNinoForLocalTesting: String =
    s"""
       |{
       |	"credId": "123456789",
       |    "affinityGroup": "Individual",
       |    "confidenceLevel": 200,
       |    "credentialStrength": "strong",
       |    "nino": "$invalidNinoForLocalTesting",
       |	"enrolments": []
       |}
      """.stripMargin

  def mainBody(nino: String, affinityGroup: String, credentialRole: String, enrolments: String, delegatedEnrolments: String): String =
    s"""
       | {
       |  "internalId": "Int-a7688cda-d983-472d-9971-ddca5f124641",
       |  "externalId": "Ext-c4ebc935-ac7a-4cc2-950a-19e6fac91f2a",
       |  "credentials": {
       |     "providerId": "8124873381064832",
       |     "providerType": "GovernmentGateway"
       |  },
       |  "confidenceLevel": 200,
       |  "nino": "$nino",
       |  "usersName": "test",
       |  "credentialRole": "$credentialRole",
       |  "agentInformation": {
       |  },
       |  "itmpData": $itmpData,
       |  "affinityGroup": "$affinityGroup",
       |  "credentialStrength": "strong",
       |  "loginTimes": {
       |     "currentLogin":"2016-11-27T09:00:00.000Z",
       |     "previousLogin":"2016-11-01T12:00:00.000Z"
       |  },
       |  "credId": "${Random.nextInt(Int.MaxValue).toString}",
       |  "enrolments": $enrolments,
       |  "delegatedEnrolments": $delegatedEnrolments
       |}
     """.stripMargin

  def mtdSaEnrolment(mtditid: String): String =
    s"""
       |[
       |  {
       |    "key": "HMRC-MTD-IT",
       |    "identifiers": [
       |      {
       |        "key": "MTDITID",
       |        "value": "$mtditid"
       |      }
       |    ],
       |    "state": "Activated"
       |  }
       |]
     """.stripMargin

  def agentEnrolment(agentReferenceNumber: String): String =
    s"""
       |[
       |  {
       |    "key": "HMRC-AS-AGENT",
       |    "identifiers": [
       |      {
       |        "key": "AgentReferenceNumber",
       |        "value": "$agentReferenceNumber"
       |      }
       |    ],
       |    "state": "Activated"
       |  }
       |]
     """.stripMargin

  def mtdSaDelegatedEnrolment(mtditid: String): String =
    s"""
       |[
       |  {
       |     "key": "HMRC-MTD-IT",
       |     "identifiers": [
       |       {
       |         "key": "MTDITID",
       |          "value": "$mtditid"
       |       }
       |     ],
       |     "delegatedAuthRule": "mtd-it-auth"
       |  }
       |]
     """.stripMargin

  private val itmpData: String =
    """
      |{
      |  "givenName": "Testy",
      |  "middleName": "Gerald",
      |  "familyName": "McTestface",
      |  "birthdate": "1990-12-30",
      |  "address": {
      |     "line1": "line 1",
      |     "line2": "line 2",
      |     "line3": "line 3",
      |     "line4": "line 4",
      |     "line5": "line 5",
      |     "postCode": "TF3 4ER",
      |     "countryName": "United Kingdom",
      |     "countryCode": "UK"
      |  }
      |}
    """.stripMargin

}
