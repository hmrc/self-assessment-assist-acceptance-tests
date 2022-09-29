/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json.{Json, OFormat}

case class Messages(info: Option[Seq[Message]],
                    warnings: Option[Seq[Message]],
                    errors: Option[Seq[Message]])

object Messages {
  implicit val format: OFormat[Messages] = Json.format[Messages]
}