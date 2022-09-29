/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.endOfYearEstimateMandatory

import play.api.libs.json.{Json, OFormat}

case class IncomeSourceMandatory(incomeSourceId: String,
                                 incomeSourceType: String,
                                 incomeSourceName: String,
                                 taxableIncome: BigInt,
                                 finalised: Boolean)

object IncomeSourceMandatory {
  implicit val format: OFormat[IncomeSourceMandatory] = Json.format[IncomeSourceMandatory]
}