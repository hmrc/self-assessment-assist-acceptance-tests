/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class ExcessOfLifetimeAllowanceV2(totalChargeableAmount: BigDecimal,
                                       totalTaxPaid: BigDecimal,
                                       lumpSumBenefitTakenInExcessOfLifetimeAllowance: PensionSavingsDetailBreakdownV2,
                                       benefitInExcessOfLifetimeAllowance: PensionSavingsDetailBreakdownV2)

object ExcessOfLifetimeAllowanceV2 {
  implicit val format: OFormat[ExcessOfLifetimeAllowanceV2] = Json.format[ExcessOfLifetimeAllowanceV2]
}
