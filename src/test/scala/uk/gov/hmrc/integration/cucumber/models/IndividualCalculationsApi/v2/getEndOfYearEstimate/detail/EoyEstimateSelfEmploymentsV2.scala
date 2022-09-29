/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateSelfEmploymentsV2(selfEmploymentId: String, taxableIncome: BigInt, finalised: Option[Boolean])

object EoyEstimateSelfEmploymentsV2 {
  implicit val formats: OFormat[EoyEstimateSelfEmploymentsV2] = Json.format[EoyEstimateSelfEmploymentsV2]
}
