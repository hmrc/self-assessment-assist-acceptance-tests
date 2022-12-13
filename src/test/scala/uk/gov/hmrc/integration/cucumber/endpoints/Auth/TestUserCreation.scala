/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import org.openqa.selenium.By
import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AgentAuthorisation._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AuthLoginApi._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.CreateTestUser._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.OAuth._
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.utils.json.JsonTools

object TestUserCreation extends JsonTools {

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    Local user setup    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */

  def createLocalTestUser(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup)
    TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
  }

  def createLocalTestUserWithInvalidNino(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(invalidNino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    else TaxPayer(randomNino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
  }

  def createSATestUserWithInvalidNino(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createUserAuthorisedOnApiPlatform(affinityGroup)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(invalidNino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    else TaxPayer(randomNino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithNoMatchingMtditid(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup, invalidMtditid = true)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    else TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithInvalidBearerToken(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, "Bearer invalid", None)
    else TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, "Bearer invalid", newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithInvalidEnrolment(affinityGroup: String): TaxPayer = {
    if (affinityGroup != AffinityGroup.Agent) {
      val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup, clientEnrolled = false)
      TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    } else {
      val newTaxPayer = createLocalTestUserWithAuthLoginApi(AffinityGroup.Agent, agentEnrolled = false)
      TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
    }
  }

  def createLocalAgentNotAuthorisedForClient: TaxPayer = {
    val agent           = createLocalTestUserWithAuthLoginApi(AffinityGroup.Agent)
    val unrelatedClient = createLocalTestUserWithAuthLoginApi(AffinityGroup.Organisation)
    TaxPayer(unrelatedClient.nino, unrelatedClient.mtditid, agent.accessToken, agent.agentReferenceNumber)
  }

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ Api Platform user setup ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */

  def createUserAuthorisedOnApiPlatform(affinityGroup: String): TaxPayer = {

    // Create test user
    val clientCreateTestUser = createTestUser(affinityGroup)
    val userId: String       = retrieveJsonValue(clientCreateTestUser, "userId")
    val password: String     = retrieveJsonValue(clientCreateTestUser, "password")
    val nino: String         = retrieveJsonValue(clientCreateTestUser, "nino")
    val mtditid: String      = retrieveJsonValue(clientCreateTestUser, "mtdItId")
    val userFullName: String      = retrieveJsonValue(clientCreateTestUser, "userFullName")
    print("userId = " + userId)
    print("\npassword = " + password)
    print ("\nuserFullName = " + userFullName)

    // Grant authority to vendor
    if (env == "development") grantAuthorityToVendorWithPassword(userId, password)
    else if (env == "externaltest") grantAuthorityToVendorOnETWithPassword(userId, password)
    else grantAuthorityToVendorWithLoginStub(affinityGroup, nino, mtditid)

    // Grab oauth code from url
    //val oauthCode: String = driver.getCurrentUrl.split("code=")(1).split("&")(0)
   val oauthCode: String = driver.findElement(By.cssSelector("#authorisation-code")).getText

    // Request access token
    val accessToken: String = requestAccessToken(oauthCode)

    TaxPayer(nino, mtditid, accessToken, None)
  }

  def loginToAuthLogin (nino: String): Unit = {
    navigateTo(authLoginStubUrl)
  }

  def createAgentUserAuthorisedOnApiPlatform: TaxPayer = {

    // Create Agent
    val agentCreateTestUser = createTestUser(AffinityGroup.Agent)
    val userId: String      = retrieveJsonValue(agentCreateTestUser, "userId")
    val password: String    = retrieveJsonValue(agentCreateTestUser, "password")
    val arn: String         = retrieveJsonValue(agentCreateTestUser, "agentServicesAccountNumber")

    // Grant authority to vendor
    if (env == "development") grantAuthorityToVendorWithPassword(userId, password)
    else if (env == "externaltest") grantAuthorityToVendorOnETWithPassword(userId, password)
    else grantAuthorityToVendorWithLoginStub(AffinityGroup.Agent, arn)

    // Grab oauth code from url
    val oauthCode: String = driver.getCurrentUrl.split("code=")(1).split("&")(0)

    // Request access token
    val accessToken: String = requestAccessToken(oauthCode)

    // Create Client
    val clientCreateTestUser      = createTestUser(AffinityGroup.Individual)
    val nino: String              = retrieveJsonValue(clientCreateTestUser, "nino")
    val mtditid: String           = retrieveJsonValue(clientCreateTestUser, "mtdItId")
    val individualDetails: String = retrieveJsonValue(clientCreateTestUser, "individualDetails")
    val knownFact: String         = individualDetails.split("postcode:")(1).split("}")(0)

    // Create Agent Client relationship
    val inviteId: String = createAgentAuthorisationInvite(arn, accessToken, nino, knownFact)
    acceptAgentAuthorisationInvite(inviteId)

    TaxPayer(nino, mtditid, accessToken, Some(arn))
  }

  def generateAccessTokenOnApiPlatform(affinityGroup: String, nino: String, mtditid: String): TaxPayer = {

    // Grant authority to vendor
    grantAuthorityToVendorWithLoginStub(affinityGroup, nino, mtditid)

    // Grab oauth code from url
    val oauthCode: String = driver.getCurrentUrl.split("code=")(1).split("&")(0)

    // Request access token
    val accessToken: String = requestAccessToken(oauthCode)

    TaxPayer(nino, mtditid, accessToken, None)
  }

  def retrieveMtditid(nino: String): String = {

    // API #5 Get Business Details
    def desUrl: String = s"https://admin.qa.tax.service.gov.uk/des/registration/business-details/nino/$nino"

    val headers: Map[String, String] = Map("Authorization" -> "Bearer EvYRlYH8AS_hZGw32ffqJ25Mz04a", "Environment" -> "ist0")

    def response = getHttpWithTimeout(desUrl).headers(headers).asString
    withClue(s"Call to DES API 5 failed! - $desUrl -") {
      response.code shouldBe 200
    }

    val mtditid: String = (Json.parse(response.body) \ "mtdbsa").get.toString.replaceAll("\"", "")

    mtditid
  }

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒     Print config    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */

  def printTaxPayer(): Unit = {
    if (printConfig)
      println(
        "\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
          "\nTax Payer" +
          s"\n  nino: ${taxPayer.nino}" +
          s"\n  mtditid: ${taxPayer.mtditid}" +
          s"\n  accessToken: ${taxPayer.accessToken}" +
          s"\n  agentReferenceNumber: ${taxPayer.agentReferenceNumber}" +
          "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░")
  }

}
