/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object AuthLoginStub {

  def loginClientUsingAuthLoginStub(affinityGroup: String, nino: String, mtditid: String): Unit = {

    navigateTo(authLoginStubUrl)

    findElementByName("affinityGroup").sendKeys(affinityGroup)
    findElementByName("credentialStrength").sendKeys("Strong")
    findElementByName("redirectionUrl").sendKeys(oauthAuthorizeUrl)
    new Select(findElementByName("confidenceLevel")).selectByVisibleText("200")
    if (affinityGroup == AffinityGroup.Individual) {
      findElementByName("nino").sendKeys(nino)
    }
    findElementByName(s"enrolment[0].name").sendKeys("HMRC-MTD-IT")
    findElementByName(s"enrolment[0].taxIdentifier[0].name").sendKeys("MTDITID")
    findElementByName(s"enrolment[0].taxIdentifier[0].value").sendKeys(mtditid)
    findElementByName(s"enrolment[0].state").sendKeys("Activated")

    findElementById("submit").click()
  }

  def loginAgentUsingAuthLoginStub(arn: String): Unit = {

    navigateTo(authLoginStubUrl)

    findElementByName("redirectionUrl").sendKeys(oauthAuthorizeUrl)
    findElementByName("credentialStrength").sendKeys("Strong")
    findElementByName("affinityGroup").sendKeys(AffinityGroup.Agent)
    findElementByName(s"enrolment[0].name").sendKeys("HMRC-AS-AGENT")
    findElementByName(s"enrolment[0].taxIdentifier[0].name").sendKeys("AgentReferenceNumber")
    findElementByName(s"enrolment[0].taxIdentifier[0].value").sendKeys(arn)
    findElementByName(s"enrolment[0].state").sendKeys("Activated")

    findElementById("submit").click()
  }

}
