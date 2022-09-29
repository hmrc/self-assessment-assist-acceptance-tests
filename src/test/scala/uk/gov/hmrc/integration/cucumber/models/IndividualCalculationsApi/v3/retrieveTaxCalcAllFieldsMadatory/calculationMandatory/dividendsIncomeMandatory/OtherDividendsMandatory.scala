/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class OtherDividendsMandatory(typeOfDividend: String,
                                   customerReference: String,
                                   grossAmount: BigDecimal)

object OtherDividendsMandatory {
  implicit val format: OFormat[OtherDividendsMandatory] = Json.format[OtherDividendsMandatory]
}