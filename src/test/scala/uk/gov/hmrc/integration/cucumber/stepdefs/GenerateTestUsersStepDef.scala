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

package uk.gov.hmrc.integration.cucumber.stepdefs

import org.junit.Assert
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AuthLoginStub
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.TestUserCreation._
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.utils.data.TestData

class GenerateTestUsersStepDef extends BaseStepDef with TestData {

  Given("""^I make a POST call to nino to activate the services$""") { () =>
    postNinoLocalTesting()
  }

  Given("""^I make a POST call to generate auth token with valid nino$""") { () =>
    authTokenGeneratorLocalTesting()
  }

  Given("""^I make a POST call to generate auth token with invalid nino$""") { () =>
    authTokenGeneratorWithInvalidNinoLocalTesting()
  }

  Given("""^I make a POST call to generate report with valid nino$""") { () =>
    authTokenGeneratorLocalTesting()
    generateReportLocalTesting()
  }

  Given("""^I make a POST call to generate report with invalid nino$""") { () =>
    authTokenGeneratorLocalTesting()
    generateReportWithInvalidNinoLocalTesting()
  }

  Given("""^I make a POST call to generate acknowledge report with valid nino$""") { () =>
    authTokenGeneratorLocalTesting()
    generateReportLocalTesting()
    generateAcknowledgeReportLocalTesting()
  }

  Given("""^I make a POST call to generate acknowledge report with invalid reportID nino$""") { () =>
    authTokenGeneratorLocalTesting()
    generateReportLocalTesting()
    generateAcknowledgeReportWithInvalidReportIdLocalTesting()
  }

  Given("""^I make a POST call to generate acknowledge report with invalid correlationID nino$""") { () =>
    postNinoLocalTesting()
    authTokenGeneratorLocalTesting()
    generateReportLocalTesting()
    generateAcknowledgeReportWithInvalidCorrelationIdLocalTesting()
  }

  And("""^I close the browser$""") { () =>
    driver.quit()
  }

  Given("""^I generate tax payers with invalid nino$""") { () =>
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
