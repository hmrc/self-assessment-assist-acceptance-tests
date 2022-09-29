/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.seafarersDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class SeafarersDeductionsMandatory(totalSeafarersDeduction: BigDecimal,
                                        seafarersDeductionDetail: Seq[SeafarersDeductionDetailMandatory])

object SeafarersDeductionsMandatory {
  implicit val format: OFormat[SeafarersDeductionsMandatory] = Json.format[SeafarersDeductionsMandatory]
}