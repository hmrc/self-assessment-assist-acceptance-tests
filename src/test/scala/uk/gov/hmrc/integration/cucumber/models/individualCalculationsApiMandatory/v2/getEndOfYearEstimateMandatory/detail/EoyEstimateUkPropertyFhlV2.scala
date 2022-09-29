/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkPropertyFhlV2(taxableIncome: BigInt, finalised: Boolean)

object EoyEstimateUkPropertyFhlV2 {
  implicit val formats: OFormat[EoyEstimateUkPropertyFhlV2] = Json.format[EoyEstimateUkPropertyFhlV2]
}
