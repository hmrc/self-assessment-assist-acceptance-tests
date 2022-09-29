/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.seafarersDeductions

import play.api.libs.json.{Json, OFormat}

case class SeafarersDeductions(totalSeafarersDeduction: BigDecimal,
                               seafarersDeductionDetail: Seq[SeafarersDeductionDetail])

object SeafarersDeductions {
  implicit val format: OFormat[SeafarersDeductions] = Json.format[SeafarersDeductions]
}