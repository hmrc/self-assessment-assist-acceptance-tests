/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateUkSavingsV2(savingsAccountId: String, savingsAccountName: String, taxableIncome: BigInt)

object EoyEstimateUkSavingsV2 {
  implicit val formats: OFormat[EoyEstimateUkSavingsV2] = Json.format[EoyEstimateUkSavingsV2]
}
