/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateOtherIncomeV2(taxableIncome: BigInt)

object EoyEstimateOtherIncomeV2 {
  implicit val format: OFormat[EoyEstimateOtherIncomeV2] = Json.format[EoyEstimateOtherIncomeV2]
}
