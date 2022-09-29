/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary

import play.api.libs.json.{Json, OFormat}

case class Adjustments(includedNonTaxableProfits: Option[BigDecimal],
                       basisAdjustment: Option[BigDecimal],
                       overlapReliefUsed: Option[BigDecimal],
                       accountingAdjustment: Option[BigDecimal],
                       averagingAdjustment: Option[BigDecimal],
                       outstandingBusinessIncome: Option[BigDecimal],
                       balancingChargeBpra: Option[BigDecimal],
                       balancingChargeOther: Option[BigDecimal],
                       goodsAndServicesOwnUse: Option[BigDecimal])

object Adjustments {
  implicit val format: OFormat[Adjustments] = Json.format[Adjustments]
}
