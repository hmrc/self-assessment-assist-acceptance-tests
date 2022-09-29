/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class DefaultCarriedForwardLossesMandatory(incomeSourceId: String,
                                                incomeSourceType: String,
                                                taxYearLossIncurred: String,
                                                currentLossValue: BigInt)

object DefaultCarriedForwardLossesMandatory {
  implicit val format: OFormat[DefaultCarriedForwardLossesMandatory] = Json.format[DefaultCarriedForwardLossesMandatory]
}