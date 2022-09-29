/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class StatePensionLumpSumMandatory(incomeSourceId: String,
                                        amount: BigDecimal,
                                        taxPaid: BigDecimal,
                                        rate: BigDecimal,
                                        source: String)

object StatePensionLumpSumMandatory {
  implicit val format: OFormat[StatePensionLumpSumMandatory] = Json.format[StatePensionLumpSumMandatory]
}