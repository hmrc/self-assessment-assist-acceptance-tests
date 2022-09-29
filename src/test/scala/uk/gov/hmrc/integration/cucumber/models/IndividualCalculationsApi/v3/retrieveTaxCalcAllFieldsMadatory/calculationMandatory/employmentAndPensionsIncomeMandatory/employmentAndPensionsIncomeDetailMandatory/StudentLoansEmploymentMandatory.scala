/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class StudentLoansEmploymentMandatory(uglDeductionAmount: BigDecimal,
                                           pglDeductionAmount: BigDecimal)

object StudentLoansEmploymentMandatory {
  implicit val format: OFormat[StudentLoansEmploymentMandatory] = Json.format[StudentLoansEmploymentMandatory]
}