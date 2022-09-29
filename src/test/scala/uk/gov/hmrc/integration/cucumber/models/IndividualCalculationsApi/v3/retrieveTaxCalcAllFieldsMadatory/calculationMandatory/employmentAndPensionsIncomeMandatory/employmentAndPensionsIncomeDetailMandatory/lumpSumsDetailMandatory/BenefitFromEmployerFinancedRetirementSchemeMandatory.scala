/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class BenefitFromEmployerFinancedRetirementSchemeMandatory(amount: BigDecimal,
                                                                exemptAmount: BigDecimal,
                                                                taxPaid: BigDecimal,
                                                                taxTakenOffInEmployment: Boolean)

object BenefitFromEmployerFinancedRetirementSchemeMandatory {
  implicit val format: OFormat[BenefitFromEmployerFinancedRetirementSchemeMandatory] = Json.format[BenefitFromEmployerFinancedRetirementSchemeMandatory]
}