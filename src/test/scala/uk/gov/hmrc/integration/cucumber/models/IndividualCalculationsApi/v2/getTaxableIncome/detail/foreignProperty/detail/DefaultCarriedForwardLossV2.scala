/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.foreignProperty.detail

import play.api.libs.json._

case class DefaultCarriedForwardLossV2(taxYearLossIncurred: String, currentLossValue: BigInt)

object DefaultCarriedForwardLossV2 {
  implicit val formats: OFormat[DefaultCarriedForwardLossV2] = Json.format[DefaultCarriedForwardLossV2]
}
