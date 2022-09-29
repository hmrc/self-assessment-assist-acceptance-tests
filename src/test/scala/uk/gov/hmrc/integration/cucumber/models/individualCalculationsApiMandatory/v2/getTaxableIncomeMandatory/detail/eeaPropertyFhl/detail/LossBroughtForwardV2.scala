/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.eeaPropertyFhl.detail

import play.api.libs.json._

case class LossBroughtForwardV2(taxYearLossIncurred: String, currentLossValue: BigInt, mtdLoss: Boolean)

object LossBroughtForwardV2 {
  implicit val format: OFormat[LossBroughtForwardV2] = Json.format[LossBroughtForwardV2]
}
