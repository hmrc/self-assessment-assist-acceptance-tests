/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class EmploymentAndPensionsIncomeMandatory(totalPayeEmploymentAndLumpSumIncome: BigDecimal,
                                                totalOccupationalPensionIncome: BigDecimal,
                                                totalBenefitsInKind: BigDecimal,
                                                tipsIncome: BigDecimal,
                                                employmentAndPensionsIncomeDetail: Seq[EmploymentAndPensionsIncomeDetailMandatory])

object EmploymentAndPensionsIncomeMandatory {
  implicit val format: OFormat[EmploymentAndPensionsIncomeMandatory] = Json.format[EmploymentAndPensionsIncomeMandatory]
}