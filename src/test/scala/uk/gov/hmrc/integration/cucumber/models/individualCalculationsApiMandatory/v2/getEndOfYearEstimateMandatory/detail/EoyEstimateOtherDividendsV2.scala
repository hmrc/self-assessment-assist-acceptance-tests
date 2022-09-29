/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateOtherDividendsV2(taxableIncome: BigInt)

object EoyEstimateOtherDividendsV2 {
  implicit val format: OFormat[EoyEstimateOtherDividendsV2] = Json.format[EoyEstimateOtherDividendsV2]
}
