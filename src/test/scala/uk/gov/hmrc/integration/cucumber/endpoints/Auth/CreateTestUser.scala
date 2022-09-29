/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.OAuth.setupVendorAccessToken

object CreateTestUser {

  def createTestUser(affinityGroup: String): String = {

    val accessToken: String = if (env == "local") "" else setupVendorAccessToken

    val url: String = s"$apiPlatformTestUserUrl/${affinityGroup.toLowerCase}s"

    val body: String =
      if (affinityGroup.equals(AffinityGroup.Agent)) Json.parse("""{"serviceNames":["agent-services"]}""").toString
      else Json.parse("""{"serviceNames":["mtd-income-tax"]}""").toString

    val headers: Map[String, String] = Map(
      "Accept"        -> "application/vnd.hmrc.1.0+json",
      "Authorization" -> accessToken,
      "Content-Type"  -> "application/json"
    )

    val response = getHttpWithTimeout(url).postData(body).headers(headers).asString

    response.code shouldBe 201

    response.body.toString
  }

}
