/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkPropertyNonFhlV2(taxableIncome: BigInt, finalised: Option[Boolean])

object EoyEstimateUkPropertyNonFhlV2 {
  implicit val formats: OFormat[EoyEstimateUkPropertyNonFhlV2] = Json.format[EoyEstimateUkPropertyNonFhlV2]
}
