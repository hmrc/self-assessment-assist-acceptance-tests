/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory._

case class EmploymentAndPensionsIncomeDetailMandatory(incomeSourceId: String,
                                                      source: String,
                                                      occupationalPension: Boolean,
                                                      employerRef: String,
                                                      employerName: String,
                                                      payrollId: String,
                                                      startDate: String,
                                                      dateEmploymentEnded: String,
                                                      taxablePayToDate: BigDecimal,
                                                      totalTaxToDate: BigDecimal,
                                                      disguisedRemuneration: Boolean,
                                                      lumpSums: LumpSumsMandatory,
                                                      studentLoans: StudentLoansEmploymentMandatory,
                                                      benefitsInKind: BenefitsInKindMandatory)

object EmploymentAndPensionsIncomeDetailMandatory {
  implicit val format: OFormat[EmploymentAndPensionsIncomeDetailMandatory] = Json.format[EmploymentAndPensionsIncomeDetailMandatory]
}