/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkPropertyFhlV2(taxableIncome: BigInt, finalised: Option[Boolean])

object EoyEstimateUkPropertyFhlV2 {
  implicit val formats: OFormat[EoyEstimateUkPropertyFhlV2] = Json.format[EoyEstimateUkPropertyFhlV2]
}
