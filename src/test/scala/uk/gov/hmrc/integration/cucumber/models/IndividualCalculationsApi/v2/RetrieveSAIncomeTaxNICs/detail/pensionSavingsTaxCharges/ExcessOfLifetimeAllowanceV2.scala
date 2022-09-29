/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class ExcessOfLifetimeAllowanceV2(totalChargeableAmount: Option[BigDecimal],
                                       totalTaxPaid: Option[BigDecimal],
                                       lumpSumBenefitTakenInExcessOfLifetimeAllowance: Option[PensionSavingsDetailBreakdownV2],
                                       benefitInExcessOfLifetimeAllowance: Option[PensionSavingsDetailBreakdownV2])

object ExcessOfLifetimeAllowanceV2 {
  implicit val format: OFormat[ExcessOfLifetimeAllowanceV2] = Json.format[ExcessOfLifetimeAllowanceV2]
}
