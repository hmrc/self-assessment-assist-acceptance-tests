/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class CarriedForwardLossesMandatory(claimId: String,
                                         originatingClaimId: String,
                                         incomeSourceId: String,
                                         incomeSourceType: String,
                                         claimType: String,
                                         taxYearClaimMade: String,
                                         taxYearLossIncurred: String,
                                         currentLossValue: BigInt,
                                         lossType: String)

object CarriedForwardLossesMandatory {
  implicit val format: OFormat[CarriedForwardLossesMandatory] = Json.format[CarriedForwardLossesMandatory]
}