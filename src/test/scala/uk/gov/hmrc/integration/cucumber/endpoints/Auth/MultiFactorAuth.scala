/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object MultiFactorAuth {

  def completeMultiFactorAuthenticationIfRequired(): Unit = {

    val currentUrl: String = driver.getCurrentUrl

    if (currentUrl.contains(multiFactorAuthenticationUrl)) {
      findElementById("continue").click()

      confirmUrl("/registration/choose-factor")
      findElementById("factor-mobile").click()
      findElementById("continue").click()

      confirmUrl("/registration/otp/phone-number/mobile")
      findElementById("uk-phone-number-toggle-close").click()
      findElementById("phoneNumber").sendKeys("7712345678")
      findElementById("continue").click()

      confirmUrl("/registration/otp/mobile")
      val accessCodeUrl: String = driver.getCurrentUrl
      val mfaCode: String       = accessCodeUrl.split("journey/")(1).split("/registration")(0)

      navigateTo(s"$multiFactorAuthenticationUrl/test-only/journey/$mfaCode/mobile/code")
      val accessCode: String = driver.getPageSource.split("\"accessCode\":\"")(1).split("\"")(0)

      navigateTo(accessCodeUrl)
      confirmUrl("/registration/otp/mobile")
      findElementById("accessCode").sendKeys(accessCode)
      findElementById("continue").click()

      confirmUrl("/registration/success")
      findElementById("continue").click()
    }
  }

}
