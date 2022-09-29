/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateForeignPropertyV2(taxableIncome: BigInt, finalised: Boolean)

object EoyEstimateForeignPropertyV2 {
  implicit val format: OFormat[EoyEstimateForeignPropertyV2] = Json.format[EoyEstimateForeignPropertyV2]
}
