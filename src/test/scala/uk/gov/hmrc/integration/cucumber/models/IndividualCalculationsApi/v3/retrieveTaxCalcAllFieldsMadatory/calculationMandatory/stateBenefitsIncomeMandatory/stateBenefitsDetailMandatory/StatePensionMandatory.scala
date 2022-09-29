/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class StatePensionMandatory(incomeSourceId: String,
                                 amount: BigDecimal,
                                 source: String)

object StatePensionMandatory {
  implicit val format: OFormat[StatePensionMandatory] = Json.format[StatePensionMandatory]
}