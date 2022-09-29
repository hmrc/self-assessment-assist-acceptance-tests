/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2

import play.api.libs.json.{Json, OFormat}

case class MessageV2(id: String, text: String)

object MessageV2 {
  implicit val format: OFormat[MessageV2] = Json.format[MessageV2]
}
