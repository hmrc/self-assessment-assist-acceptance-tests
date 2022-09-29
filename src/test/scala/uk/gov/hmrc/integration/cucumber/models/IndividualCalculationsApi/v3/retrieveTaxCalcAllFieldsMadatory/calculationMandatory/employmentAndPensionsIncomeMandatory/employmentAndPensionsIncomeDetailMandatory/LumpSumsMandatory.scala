/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory.LumpSumsDetailMandatory

case class LumpSumsMandatory(totalLumpSum: BigDecimal,
                             totalTaxPaid: BigDecimal,
                             lumpSumsDetail: LumpSumsDetailMandatory)

object LumpSumsMandatory {
  implicit val format: OFormat[LumpSumsMandatory] = Json.format[LumpSumsMandatory]
}