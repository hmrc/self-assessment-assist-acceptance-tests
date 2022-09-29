/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.detail

import play.api.libs.json._

case class DefaultCarriedForwardLossV2(taxYearLossIncurred: String, currentLossValue: BigInt)

object DefaultCarriedForwardLossV2 {
  implicit val format: OFormat[DefaultCarriedForwardLossV2] = Json.format[DefaultCarriedForwardLossV2]
}
