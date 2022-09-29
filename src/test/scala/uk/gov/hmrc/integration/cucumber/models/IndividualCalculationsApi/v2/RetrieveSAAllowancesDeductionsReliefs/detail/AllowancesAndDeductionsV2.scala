/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class AllowancesAndDeductionsV2(personalAllowance: Option[BigInt],
                                     reducedPersonalAllowance: Option[BigInt],
                                     giftOfInvestmentsAndPropertyToCharity: Option[BigInt],
                                     blindPersonsAllowance: Option[BigInt],
                                     lossesAppliedToGeneralIncome: Option[BigInt],
                                     cgtLossSetAgainstInYearGeneralIncome: Option[BigInt],
                                     qualifyingLoanInterestFromInvestments: Option[BigDecimal],
                                     postCessationTradeReceipts: Option[BigDecimal],
                                     paymentsToTradeUnionsForDeathBenefits: Option[BigDecimal],
                                     annualPayments: Option[AnnualPaymentsV2],
                                     pensionContributions: Option[PensionContributionsV2],
                                     marriageAllowanceTransferOut: Option[MarriageAllowanceTransferOutV2])

object AllowancesAndDeductionsV2 {
  implicit val format: OFormat[AllowancesAndDeductionsV2] = Json.format[AllowancesAndDeductionsV2]
}
