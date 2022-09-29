/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.allowancesAndDeductions

import play.api.libs.json.{Json, OFormat}

case class AllowancesAndDeductions(personalAllowance: Option[BigInt],
                                   marriageAllowanceTransferOut: Option[MarriageAllowanceTransferOut],
                                   reducedPersonalAllowance: Option[BigInt],
                                   giftOfInvestmentsAndPropertyToCharity: Option[BigInt],
                                   blindPersonsAllowance: Option[BigInt],
                                   lossesAppliedToGeneralIncome: Option[BigInt],
                                   cgtLossSetAgainstInYearGeneralIncome: Option[BigInt],
                                   qualifyingLoanInterestFromInvestments: Option[BigDecimal],
                                   postCessationTradeReceipts: Option[BigDecimal],
                                   paymentsToTradeUnionsForDeathBenefits: Option[BigDecimal],
                                   grossAnnuityPayments: Option[BigDecimal],
                                   annuityPayments: Option[AnnuityPayments],
                                   pensionContributions: Option[BigDecimal],
                                   pensionContributionsDetail: Option[PensionContributionsDetail])

object AllowancesAndDeductions {
  implicit val format: OFormat[AllowancesAndDeductions] = Json.format[AllowancesAndDeductions]
}