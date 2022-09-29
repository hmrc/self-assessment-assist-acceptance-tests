/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkDividendsV2(taxableIncome: BigInt)

object EoyEstimateUkDividendsV2 {
  implicit val formats: OFormat[EoyEstimateUkDividendsV2] = Json.format[EoyEstimateUkDividendsV2]
}
