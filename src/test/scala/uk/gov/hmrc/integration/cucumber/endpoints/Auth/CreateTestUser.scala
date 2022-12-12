/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import play.api.libs.json.Json
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.OAuth.setupAssistAccessToken
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object CreateTestUser {

  def createTestUser(affinityGroup: String): String = {

    val accessToken: String = if (env == "local") "" else setupAssistAccessToken

    val url: String = s"$apiPlatformTestUserUrl/${affinityGroup.toLowerCase}s"

    val body: String =
      if (affinityGroup.equals(AffinityGroup.Agent)) Json.parse("""{"serviceNames":["agent-services"]}""").toString
      else
        Json
          .parse("""{"serviceNames":["national-insurance", 
              |"self-assessment", "mtd-income-tax"],
              |"eoriNumber": "GB1234567891144"}""".stripMargin)
          .toString

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
