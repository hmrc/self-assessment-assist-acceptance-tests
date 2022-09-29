/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.allowancesAndDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class AllowancesAndDeductionsMandatory(personalAllowance: BigInt,
                                            marriageAllowanceTransferOut: MarriageAllowanceTransferOutMandatory,
                                            reducedPersonalAllowance: BigInt,
                                            giftOfInvestmentsAndPropertyToCharity: BigInt,
                                            blindPersonsAllowance: BigInt,
                                            lossesAppliedToGeneralIncome: BigInt,
                                            cgtLossSetAgainstInYearGeneralIncome: BigInt,
                                            qualifyingLoanInterestFromInvestments: BigDecimal,
                                            postCessationTradeReceipts: BigDecimal,
                                            paymentsToTradeUnionsForDeathBenefits: BigDecimal,
                                            grossAnnuityPayments: BigDecimal,
                                            annuityPayments: AnnuityPaymentsMandatory,
                                            pensionContributions: BigDecimal,
                                            pensionContributionsDetail: PensionContributionsDetailMandatory)

object AllowancesAndDeductionsMandatory {
  implicit val format: OFormat[AllowancesAndDeductionsMandatory] = Json.format[AllowancesAndDeductionsMandatory]
}