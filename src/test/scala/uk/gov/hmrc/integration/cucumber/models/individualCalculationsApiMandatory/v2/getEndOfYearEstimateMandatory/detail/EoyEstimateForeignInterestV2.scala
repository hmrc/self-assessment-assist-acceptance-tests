/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateForeignInterestV2(taxableIncome: BigInt)

object EoyEstimateForeignInterestV2 {
  implicit val format: OFormat[EoyEstimateForeignInterestV2] = Json.format[EoyEstimateForeignInterestV2]
}
