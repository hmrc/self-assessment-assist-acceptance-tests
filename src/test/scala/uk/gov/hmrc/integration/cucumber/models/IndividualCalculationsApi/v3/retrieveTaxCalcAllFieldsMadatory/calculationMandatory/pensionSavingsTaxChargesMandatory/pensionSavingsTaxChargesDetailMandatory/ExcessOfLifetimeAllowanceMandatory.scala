/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class ExcessOfLifetimeAllowanceMandatory(totalChargeableAmount: BigDecimal,
                                              totalTaxPaid: BigDecimal,
                                              lumpSumBenefitTakenInExcessOfLifetimeAllowance: PensionSavingsDetailBreakdownMandatory,
                                              benefitInExcessOfLifetimeAllowance: PensionSavingsDetailBreakdownMandatory)

object ExcessOfLifetimeAllowanceMandatory {
  implicit val format: OFormat[ExcessOfLifetimeAllowanceMandatory] = Json.format[ExcessOfLifetimeAllowanceMandatory]
}
