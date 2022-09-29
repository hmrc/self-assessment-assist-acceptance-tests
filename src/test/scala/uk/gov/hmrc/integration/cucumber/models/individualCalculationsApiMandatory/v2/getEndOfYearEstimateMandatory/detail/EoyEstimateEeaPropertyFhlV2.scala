/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateEeaPropertyFhlV2(taxableIncome: BigInt)

object EoyEstimateEeaPropertyFhlV2 {
  implicit val format: OFormat[EoyEstimateEeaPropertyFhlV2] = Json.format[EoyEstimateEeaPropertyFhlV2]
}
