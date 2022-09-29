/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.lumpSumsDetail

import play.api.libs.json.{Json, OFormat}

case class TaxableLumpSumsAndCertainIncome(amount: Option[BigDecimal],
                                           taxPaid: Option[BigDecimal],
                                           taxTakenOffInEmployment: Option[Boolean])

object TaxableLumpSumsAndCertainIncome {
  implicit val format: OFormat[TaxableLumpSumsAndCertainIncome] = Json.format[TaxableLumpSumsAndCertainIncome]
}