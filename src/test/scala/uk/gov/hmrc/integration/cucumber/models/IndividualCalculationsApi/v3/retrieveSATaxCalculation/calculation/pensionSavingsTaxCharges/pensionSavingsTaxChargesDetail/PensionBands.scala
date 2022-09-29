/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionBands(name: String,
                        rate: BigDecimal,
                        bandLimit: BigInt,
                        apportionedBandLimit: BigInt,
                        contributionAmount: BigDecimal,
                        pensionCharge: BigDecimal)

object PensionBands {
  implicit val format: OFormat[PensionBands] = Json.format[PensionBands]
}
