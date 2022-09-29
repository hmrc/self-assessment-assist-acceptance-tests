/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkPropertyNonFhlV2(taxableIncome: BigInt, finalised: Boolean)

object EoyEstimateUkPropertyNonFhlV2 {
  implicit val formats: OFormat[EoyEstimateUkPropertyNonFhlV2] = Json.format[EoyEstimateUkPropertyNonFhlV2]
}
