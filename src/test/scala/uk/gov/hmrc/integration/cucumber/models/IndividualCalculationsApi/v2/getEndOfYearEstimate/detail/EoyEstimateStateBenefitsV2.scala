/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateStateBenefitsV2(taxableIncome: BigInt)

object EoyEstimateStateBenefitsV2 {
  implicit val format: OFormat[EoyEstimateStateBenefitsV2] = Json.format[EoyEstimateStateBenefitsV2]
}
