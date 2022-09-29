/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class AnnualAdjustments(incomeSourceId: String,
                             incomeSourceType: String,
                             bsasId: String,
                             receivedDateTime: String,
                             applied: Boolean)

object AnnualAdjustments {
  implicit val format: OFormat[AnnualAdjustments] = Json.format[AnnualAdjustments]
}