/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory

import play.api.libs.json.{Json, OFormat}

case class UkPropertyMandatory(amountClaimed: BigDecimal,
                               allowableAmount: BigDecimal,
                               carryForwardAmount: BigDecimal)

object UkPropertyMandatory {
  implicit val format: OFormat[UkPropertyMandatory] = Json.format[UkPropertyMandatory]
}
