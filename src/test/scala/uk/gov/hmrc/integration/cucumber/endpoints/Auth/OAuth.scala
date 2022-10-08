/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AuthLoginStub._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.MultiFactorAuth._
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object OAuth {

  def requestAccessToken(oauthCode: String): String = {

    val jsonBody: String = Json
      .parse(s"""
         |{
         |  "client_id": "${thirdPartyApp.clientId}",
         |  "client_secret": "${thirdPartyApp.clientSecret}",
         |  "grant_type": "authorization_code",
         |  "code": "$oauthCode",
         |   "redirect_uri": "${thirdPartyApp.redirectUrl}"
         |}
      """.stripMargin)
      .toString

    val urlEncodedBody: String =
      s"client_id=${thirdPartyApp.clientId}" +
        s"&client_secret=${thirdPartyApp.clientSecret}" +
        s"&grant_type=authorization_code" +
        s"&code=$oauthCode" +
        s"&redirect_uri=${thirdPartyApp.redirectUrl}"

    response =
      if (env == "qa") getHttpWithTimeout(s"$oauthApiUrl/token").postData(urlEncodedBody).headers(contentTypeUrlEncodedHeader).asString
      else getHttpWithTimeout(s"$oauthApiUrl/token").postData(jsonBody).headers(contentTypeHeader).asString

    val accessToken: String = "Bearer " + response.body.split("\"access_token\":\"")(1).split("\"")(0)

    accessToken
  }

  def grantAuthorityToVendorWithLoginStub(affinityGroup: String, identifier: String, mtditid: String = ""): Unit = {
    if (affinityGroup == AffinityGroup.Agent) loginAgentUsingAuthLoginStub(identifier)
    else loginClientUsingAuthLoginStub(affinityGroup, identifier, mtditid)

    confirmUrl(s"$oauthFrontendUrl/start")
    findElementByCssSelector("[data-module=govuk-button]").click()

    confirmUrl(s"$oauthFrontendUrl/whatYouWillNeed")
    findElementByCssSelector("[data-module=govuk-button]").click()

    completeMultiFactorAuthenticationIfRequired()

    confirmUrl(s"$oauthFrontendUrl/grantscope")
    findElementById("givePermission").click()
    Thread.sleep(1000)
  }

  def grantAuthorityToVendorWithPassword(userId: String, password: String): Unit = {
    navigateTo(oauthAuthorizeUrl)
  //confirmUrl(s"$oauthFrontendUrl/start")
    findElementByCssSelector("[data-module=govuk-button]").click()
   // findElementByCssSelector("[Continue]").click()

   // confirmUrl(s"$oauthFrontendUrl/whatYouWillNeed")
    findElementByCssSelector("[data-module=govuk-button]").click()

    // Login
    findElementById("userId").sendKeys(userId)
    findElementById("password").sendKeys(password)
    findElementById("submit").click()

    // IV-Stub
    if(driver.getCurrentUrl contains "/iv-stub/confirm/proxy/") {
      findElementById("forNino").sendKeys(randomNino)
      findElementById("submit-continue").click()
    }

    //confirmUrl(s"$oauthFrontendUrl/grantscope")
    // Check for agent error
    if(driver.getPageSource contains "You cannot access client data at the moment") {
      println("\n\n⚠️ ⚠️ ⚠️  Agents not working: You cannot access client data at the moment  ⚠️ ⚠️ ⚠️\n\n")
    }
    findElementById("givePermission").click()
    Thread.sleep(1.*(1000))
  }


  def grantAuthorityToVendorOnETWithPassword(userId: String, password: String): Unit = {
    navigateTo(oauthAuthorizeUrl)
    confirmUrl(s"$oauthFrontendUrl/start")
    findElementByCssSelector("[data-module=govuk-button]").click()

    //    confirmUrl(s"$oauthFrontendUrl/whatYouWillNeed")
    //    findElementByCssSelector("[data-module=govuk-button]").click()

    // Login
    findElementById("userId").sendKeys(userId)
    findElementById("password").sendKeys(password)
    findElementById("submit").click()

    // IV-Stub
    if(driver.getCurrentUrl contains "/iv-stub/confirm/proxy/") {
      findElementById("forNino").sendKeys(randomNino)
      findElementById("submit-continue").click()
    }

    confirmUrl(s"$oauthFrontendUrl/grantscope")
    // Check for agent error
    if(driver.getPageSource contains "You cannot access client data at the moment") {
      println("\n\n⚠️ ⚠️ ⚠️  Agents not working: You cannot access client data at the moment  ⚠️ ⚠️ ⚠️\n\n")
    }
    findElementById("authorise").click()
    Thread.sleep(1.*(1000))
  }

  def setupVendorAccessToken: String = {

    val jsonBody: String = Json
      .parse(s"""
         |{
         |  "client_id": "${thirdPartyApp.clientId}",
         |  "client_secret": "${thirdPartyApp.clientSecret}",
         |  "grant_type": "client_credentials"
         |}
      """.stripMargin)
      .toString

    val urlEncodedBody: String =
      s"client_id=${thirdPartyApp.clientId}" +
        s"&client_secret=${thirdPartyApp.clientSecret}" +
        s"&grant_type=client_credentials"

    response =
      if (env == "qa") getHttpWithTimeout(s"$oauthApiUrl/token").postData(urlEncodedBody).headers(contentTypeUrlEncodedHeader).asString
      else getHttpWithTimeout(s"$oauthApiUrl/token").postData(jsonBody).headers(contentTypeHeader).asString

    val accessToken: String = "Bearer " + response.body.split("\"access_token\":\"")(1).split("\"")(0)

    accessToken
  }

  def setupAssistAccessToken: String = {

    val jsonBody: String = Json
      .parse(s"""
         |{
         |  "client_id": "${thirdPartyToken3.clientId1}",
         |  "client_secret": "${thirdPartyToken3.clientSecret1}",
         |  "grant_type": "client_credentials",
         |  "scope": "read:self-assessment-assist write:self-assessment-assist"
         |}
      """.stripMargin)
      .toString

    val urlEncodedBody: String =
      s"client_id=${thirdPartyApp.clientId}" +
        s"&client_secret=${thirdPartyApp.clientSecret}" +
        s"&grant_type=client_credentials" +
        s"scope=read:self-assessment-assist write:self-assessment-assist"

    response =
      if (env == "qa") getHttpWithTimeout(s"$oauthApiUrl/token").postData(urlEncodedBody).headers(contentTypeUrlEncodedHeader).asString
      else getHttpWithTimeout(s"$oauthApiUrl/token").postData(jsonBody).headers(contentTypeHeader).asString

    val accessToken: String = "Bearer " + response.body.split("\"access_token\":\"")(1).split("\"")(0)

    accessToken
  }

}
