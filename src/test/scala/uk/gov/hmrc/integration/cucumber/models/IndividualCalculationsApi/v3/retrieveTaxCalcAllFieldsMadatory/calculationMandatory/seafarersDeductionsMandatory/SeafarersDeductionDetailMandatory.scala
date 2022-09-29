/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.seafarersDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class SeafarersDeductionDetailMandatory(nameOfShip: String,
                                             amountDeducted: BigDecimal)

object SeafarersDeductionDetailMandatory {
  implicit val format: OFormat[SeafarersDeductionDetailMandatory] = Json.format[SeafarersDeductionDetailMandatory]
}