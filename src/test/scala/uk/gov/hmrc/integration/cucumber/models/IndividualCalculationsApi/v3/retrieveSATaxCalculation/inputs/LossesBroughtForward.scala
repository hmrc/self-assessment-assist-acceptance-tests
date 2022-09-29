/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class LossesBroughtForward(lossId: Option[String],
                                incomeSourceId: String,
                                incomeSourceType: String,
                                submissionTimestamp: Option[String],
                                lossType: Option[String],
                                taxYearLossIncurred: String,
                                currentLossValue: BigInt,
                                mtdLoss: Option[Boolean])

object LossesBroughtForward {
  implicit val format: OFormat[LossesBroughtForward] = Json.format[LossesBroughtForward]
}