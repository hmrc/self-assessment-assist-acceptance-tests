/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.utils.data.{TestData, User}

object AuthLoginStub extends TestData {

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

  def loginAgentUsingAuthLoginStubNEW(user: User): Unit = {
    navigateTo("https://www.development.tax.service.gov.uk/auth-login-stub/gg-sign-in")
    findElementByName("redirectionUrl").sendKeys("/auth-login-stub/session")
    findElementByName("credentialStrength").sendKeys("Strong")
    findElementByName("affinityGroup").sendKeys(AffinityGroup.Individual)
    if (user.nino.isDefined) {
      findElementByName("nino").sendKeys(user.nino.get)
    }
    findElementById("submit").click()
  }

  def openNewChromeTab(user: User): Unit = {


  }

}
