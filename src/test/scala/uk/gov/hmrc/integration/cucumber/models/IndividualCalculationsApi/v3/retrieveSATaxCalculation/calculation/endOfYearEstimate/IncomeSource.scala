/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.endOfYearEstimate

import play.api.libs.json.{Json, OFormat}

case class IncomeSource(incomeSourceId: Option[String],
                        incomeSourceType: String,
                        incomeSourceName: Option[String],
                        taxableIncome: BigInt,
                        finalised: Option[Boolean])

object IncomeSource {
  implicit val format: OFormat[IncomeSource] = Json.format[IncomeSource]
}