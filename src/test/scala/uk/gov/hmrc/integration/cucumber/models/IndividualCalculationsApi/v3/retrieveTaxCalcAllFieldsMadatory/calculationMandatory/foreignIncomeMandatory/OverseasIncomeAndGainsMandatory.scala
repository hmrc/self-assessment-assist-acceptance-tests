/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class OverseasIncomeAndGainsMandatory(gainAmount: BigDecimal)

object OverseasIncomeAndGainsMandatory {
  implicit val format: OFormat[OverseasIncomeAndGainsMandatory] = Json.format[OverseasIncomeAndGainsMandatory]
}
