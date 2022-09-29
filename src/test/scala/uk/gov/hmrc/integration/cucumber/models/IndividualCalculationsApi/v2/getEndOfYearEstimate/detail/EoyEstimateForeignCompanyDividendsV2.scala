/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateForeignCompanyDividendsV2(taxableIncome: BigInt)

object EoyEstimateForeignCompanyDividendsV2 {
  implicit val format: OFormat[EoyEstimateForeignCompanyDividendsV2] = Json.format[EoyEstimateForeignCompanyDividendsV2]
}
