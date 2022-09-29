/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class LossesBroughtForwardMandatory(lossId: String,
                                         incomeSourceId: String,
                                         incomeSourceType: String,
                                         submissionTimestamp: String,
                                         lossType: String,
                                         taxYearLossIncurred: String,
                                         currentLossValue: BigInt,
                                         mtdLoss: Boolean)

object LossesBroughtForwardMandatory {
  implicit val format: OFormat[LossesBroughtForwardMandatory] = Json.format[LossesBroughtForwardMandatory]
}