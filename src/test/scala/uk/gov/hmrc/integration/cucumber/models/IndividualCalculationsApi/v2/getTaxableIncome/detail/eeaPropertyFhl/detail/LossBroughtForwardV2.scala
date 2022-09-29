/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl.detail

import play.api.libs.json._

case class LossBroughtForwardV2(taxYearLossIncurred: String, currentLossValue: BigInt, mtdLoss: Boolean)

object LossBroughtForwardV2 {
  implicit val formats: OFormat[LossBroughtForwardV2] = Json.format[LossBroughtForwardV2]
}
