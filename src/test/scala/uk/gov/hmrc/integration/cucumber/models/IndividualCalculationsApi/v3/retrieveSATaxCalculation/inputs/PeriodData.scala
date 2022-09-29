/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class PeriodData(deductionFromDate: String,
                      deductionToDate: String,
                      submissionTimestamp: String,
                      source: String,
                      deductionAmount: BigDecimal)

object PeriodData {
  implicit val format: OFormat[PeriodData] = Json.format[PeriodData]
}