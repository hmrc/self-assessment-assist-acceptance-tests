/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.{BenefitsInKind, LumpSums, StudentLoansEmployment}

case class EmploymentAndPensionsIncomeDetail(incomeSourceId: Option[String],
                                             source: Option[String],
                                             occupationalPension: Option[Boolean],
                                             employerRef: Option[String],
                                             employerName: Option[String],
                                             payrollId: Option[String],
                                             startDate: Option[String],
                                             dateEmploymentEnded: Option[String],
                                             taxablePayToDate: Option[BigDecimal],
                                             totalTaxToDate: Option[BigDecimal],
                                             disguisedRemuneration: Option[Boolean],
                                             lumpSums: Option[LumpSums],
                                             studentLoans: Option[StudentLoansEmployment],
                                             benefitsInKind: Option[BenefitsInKind])

object EmploymentAndPensionsIncomeDetail {
  implicit val format: OFormat[EmploymentAndPensionsIncomeDetail] = Json.format[EmploymentAndPensionsIncomeDetail]
}