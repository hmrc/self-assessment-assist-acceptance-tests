/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.lumpSumsDetail.LumpSumsDetail

case class LumpSums(totalLumpSum: Option[BigDecimal],
                    totalTaxPaid: Option[BigDecimal],
                    lumpSumsDetail: LumpSumsDetail)

object LumpSums {
  implicit val format: OFormat[LumpSums] = Json.format[LumpSums]
}