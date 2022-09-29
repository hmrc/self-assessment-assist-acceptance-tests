/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class UnclaimedLossesMandatory(incomeSourceId: String,
                                    incomeSourceType: String,
                                    taxYearLossIncurred: String,
                                    currentLossValue: BigInt,
                                    lossType: String)

object UnclaimedLossesMandatory {
  implicit val format: OFormat[UnclaimedLossesMandatory] = Json.format[UnclaimedLossesMandatory]
}