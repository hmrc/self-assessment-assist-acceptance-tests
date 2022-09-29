/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json._

case class IncomeTaxDetailV2(payPensionsProfit: Option[IncomeTypeBreakdownV2],
                             savingsAndGains: Option[IncomeTypeBreakdownV2],
                             lumpSums: Option[IncomeTypeBreakdownV2],
                             dividends: Option[IncomeTypeBreakdownV2],
                             gainsOnLifePolicies: Option[IncomeTypeBreakdownV2],
                             giftAid: Option[GiftAidV2])

object IncomeTaxDetailV2 {
  implicit val format: OFormat[IncomeTaxDetailV2] = Json.format[IncomeTaxDetailV2]
}
