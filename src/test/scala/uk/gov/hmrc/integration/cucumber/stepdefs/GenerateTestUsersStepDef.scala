/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs

import org.junit.Assert
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AuthLoginStub
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.TestUserCreation._
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.utils.data.TestData



class GenerateTestUsersStepDef extends BaseStepDef with TestData {

  Then("""^generate tax payers for given environment$""") { () =>
    env match {
      case "local" =>
        taxPayer = createLocalTestUser(AffinityGroup.Individual)
        print(AffinityGroup.Individual)
        taxPayer = createLocalTestUser(AffinityGroup.Agent)
        print(AffinityGroup.Agent)
      case "externaltest" =>
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
        print(AffinityGroup.Individual)
        taxPayer = createAgentUserAuthorisedOnApiPlatform
        print(AffinityGroup.Agent)
      case "development" =>
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
        print(AffinityGroup.Individual)
    }
  }
  Given("""^generate tax payers with invalid nino$""") { () =>
    taxPayer = createSATestUserWithInvalidNino(AffinityGroup.Individual)
    printTaxPayer()
  }

  Then("""^generate an access token for (.*) with nino (.*) and mtditid (.*)$""") { (affinityGroup: String, nino: String, mtditid: String) =>
    if (affinityGroup.equals(AffinityGroup.Agent)) {
      println("NOT YET IMPLEMENTED FOR AGENTS")
    } else {
      env match {
        case "local" =>
          println("NOT YET IMPLEMENTED IN LOCAL")
        //        taxPayer = createTaxPayer(affinityGroup)
        //        print(affinityGroup)
        case _ =>
          taxPayer = generateAccessTokenOnApiPlatform(affinityGroup, nino, mtditid)
          print(affinityGroup)
      }
    }
  }

  Then("""^generate an access token for nino (.*) with desc (.*)$""") { (nino: String, desc: String) =>
    val mtditid: String = retrieveMtditid(nino)
    taxPayer = generateAccessTokenOnApiPlatform("Individual", nino, mtditid)
    print("Individual", desc)
  }

  Given("""^I login through the Auth login page using (.*)$""") { (userType: String) =>
    val user = getUser(userType)
    AuthLoginStub.loginAgentUsingAuthLoginStubNEW(user)
  }

  Then("""^I can see the auth token page header : (.*)$""") { (expectedPageHeader: String) =>
   val actualPageHeader = findElementByTagName("h1").getText
    Assert.assertEquals(actualPageHeader, expectedPageHeader)
  }



  def print(affinityGroup: String, desc: String = "none"): Unit = {
    val client: String = if (affinityGroup == AffinityGroup.Agent) "client " else ""
    println(
      s"\n$affinityGroup" +
        s"\ndescription: $desc" +
        s"\n${client}nino: ${taxPayer.nino}" +
        s"\n${client}mtditid: ${taxPayer.mtditid}" +
        s"\naccess token: ${taxPayer.accessToken}\n")
  }

}
