/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.seafarersDeductions

import play.api.libs.json.{Json, OFormat}

case class SeafarersDeductionDetail(nameOfShip: String,
                                    amountDeducted: BigDecimal)

object SeafarersDeductionDetail {
  implicit val format: OFormat[SeafarersDeductionDetail] = Json.format[SeafarersDeductionDetail]
}