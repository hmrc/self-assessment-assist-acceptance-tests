/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints.Auth

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

object AgentAuthorisation {

  def createAgentAuthorisationInvite(arn: String, accessToken: String, clientNino: String, clientKnownFact: String): String = {

    val url: String = s"$apiPlatformAgentsAuthUrl/$arn/invitations"

    val body: String =
      s"""
         |{
         |  "service": ["MTD-IT"],
         |  "clientType":"personal",
         |  "clientIdType": "ni",
         |  "clientId": "$clientNino",
         |  "knownFact": "$clientKnownFact"
         |}
      """.stripMargin

    val headers: Map[String, String] = Map(
      "Accept"        -> "application/vnd.hmrc.1.0+json",
      "Authorization" -> s"$accessToken",
      "Content-Type"  -> "application/json"
    )

    // println("\n\nrequest: " + url + "\n" + body + "\n" + headers)

    val response = getHttpWithTimeout(url).postData(body).headers(headers).asString
    // println("\nresponse: " + response + "\n\n")
    response.code shouldBe 204

    response.header("Location").get.split("invitations/")(1)
  }

  def acceptAgentAuthorisationInvite(inviteId: String): Unit = {

    val url: String = s"$apiPlatformAgentsAuthTestUrl/invitations/$inviteId"

    val headers: Map[String, String] = Map("Accept" -> "application/vnd.hmrc.1.0+json")

    val response = getHttpWithTimeout(url).put("").headers(headers).asString
    response.code shouldBe 204
  }

}
