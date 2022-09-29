/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkSavingsV2(savingsAccountId: String, savingsAccountName: Option[String], taxableIncome: BigInt)

object EoyEstimateUkSavingsV2 {
  implicit val formats: OFormat[EoyEstimateUkSavingsV2] = Json.format[EoyEstimateUkSavingsV2]
}
