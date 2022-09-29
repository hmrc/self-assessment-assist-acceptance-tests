/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkSecuritiesV2(taxableIncome: BigInt)

object EoyEstimateUkSecuritiesV2 {
  implicit val format: OFormat[EoyEstimateUkSecuritiesV2] = Json.format[EoyEstimateUkSecuritiesV2]
}
