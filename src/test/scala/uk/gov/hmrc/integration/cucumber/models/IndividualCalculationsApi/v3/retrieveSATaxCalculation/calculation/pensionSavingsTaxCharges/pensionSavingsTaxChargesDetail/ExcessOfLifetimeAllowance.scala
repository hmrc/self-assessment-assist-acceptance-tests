/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class ExcessOfLifetimeAllowance(totalChargeableAmount: Option[BigDecimal],
                                     totalTaxPaid: Option[BigDecimal],
                                     lumpSumBenefitTakenInExcessOfLifetimeAllowance: Option[PensionSavingsDetailBreakdown],
                                     benefitInExcessOfLifetimeAllowance: Option[PensionSavingsDetailBreakdown])

object ExcessOfLifetimeAllowance {
  implicit val format: OFormat[ExcessOfLifetimeAllowance] = Json.format[ExcessOfLifetimeAllowance]
}
