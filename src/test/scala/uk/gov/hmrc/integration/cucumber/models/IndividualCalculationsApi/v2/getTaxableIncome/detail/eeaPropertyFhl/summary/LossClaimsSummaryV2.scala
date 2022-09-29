/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl.summary

import play.api.libs.json._

case class LossClaimsSummaryV2(lossForCSFHL: Option[BigInt],
                               totalBroughtForwardIncomeTaxLosses: Option[BigInt],
                               broughtForwardIncomeTaxLossesUsed: Option[BigInt],
                               totalIncomeTaxLossesCarriedForward: Option[BigInt])

object LossClaimsSummaryV2 {
  implicit val formats: OFormat[LossClaimsSummaryV2] = Json.format[LossClaimsSummaryV2]
}
