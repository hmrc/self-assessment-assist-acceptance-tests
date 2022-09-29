/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateForeignPropertyV2(taxableIncome: BigInt, finalised: Option[Boolean])

object EoyEstimateForeignPropertyV2 {
  implicit val format: OFormat[EoyEstimateForeignPropertyV2] = Json.format[EoyEstimateForeignPropertyV2]
}
