/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class OtherStateBenefitsMandatory(incomeSourceId: String,
                                       amount: BigDecimal,
                                       source: Option[String])

object OtherStateBenefitsMandatory {
  implicit val format: OFormat[OtherStateBenefitsMandatory] = Json.format[OtherStateBenefitsMandatory]
}