/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionBandsMandatory(name: String,
                                 rate: BigDecimal,
                                 bandLimit: BigInt,
                                 apportionedBandLimit: BigInt,
                                 contributionAmount: BigDecimal,
                                 pensionCharge: BigDecimal)

object PensionBandsMandatory {
  implicit val format: OFormat[PensionBandsMandatory] = Json.format[PensionBandsMandatory]
}
