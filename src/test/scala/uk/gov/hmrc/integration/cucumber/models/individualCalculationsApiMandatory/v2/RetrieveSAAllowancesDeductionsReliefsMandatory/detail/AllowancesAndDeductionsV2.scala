/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class AllowancesAndDeductionsV2(personalAllowance: BigInt,
                                     reducedPersonalAllowance: BigInt,
                                     giftOfInvestmentsAndPropertyToCharity: BigInt,
                                     blindPersonsAllowance: BigInt,
                                     lossesAppliedToGeneralIncome: BigInt,
                                     cgtLossSetAgainstInYearGeneralIncome: BigInt,
                                     qualifyingLoanInterestFromInvestments: BigDecimal,
                                     postCessationTradeReceipts: BigDecimal,
                                     paymentsToTradeUnionsForDeathBenefits: BigDecimal,
                                     annualPayments: AnnualPaymentsV2,
                                     pensionContributions: PensionContributionsV2,
                                     marriageAllowanceTransferOut: MarriageAllowanceTransferOutV2)

object AllowancesAndDeductionsV2 {
  implicit val format: OFormat[AllowancesAndDeductionsV2] = Json.format[AllowancesAndDeductionsV2]
}
