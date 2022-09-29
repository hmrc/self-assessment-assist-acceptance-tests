/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class IncapacityBenefitMandatory(incomeSourceId: String,
                                      amount: BigDecimal,
                                      taxPaid: BigDecimal,
                                      source: String)

object IncapacityBenefitMandatory {
  implicit val format: OFormat[IncapacityBenefitMandatory] = Json.format[IncapacityBenefitMandatory]
}