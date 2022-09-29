/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome

import play.api.libs.json.{Json, OFormat}

case class EmploymentAndPensionsIncome(totalPayeEmploymentAndLumpSumIncome: Option[BigDecimal],
                                       totalOccupationalPensionIncome: Option[BigDecimal],
                                       totalBenefitsInKind: Option[BigDecimal],
                                       tipsIncome: Option[BigDecimal],
                                       employmentAndPensionsIncomeDetail: Option[Seq[EmploymentAndPensionsIncomeDetail]])

object EmploymentAndPensionsIncome {
  implicit val format: OFormat[EmploymentAndPensionsIncome] = Json.format[EmploymentAndPensionsIncome]
}