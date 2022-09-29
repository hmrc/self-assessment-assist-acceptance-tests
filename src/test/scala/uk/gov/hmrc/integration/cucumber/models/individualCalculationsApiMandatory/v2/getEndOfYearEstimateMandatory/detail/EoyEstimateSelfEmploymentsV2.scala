/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateSelfEmploymentsV2(selfEmploymentId: String, taxableIncome: BigInt, finalised: Boolean)

object EoyEstimateSelfEmploymentsV2 {
  implicit val formats: OFormat[EoyEstimateSelfEmploymentsV2] = Json.format[EoyEstimateSelfEmploymentsV2]
}
