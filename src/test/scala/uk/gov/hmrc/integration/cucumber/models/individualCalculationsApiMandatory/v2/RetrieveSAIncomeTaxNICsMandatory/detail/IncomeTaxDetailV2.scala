/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json._

case class IncomeTaxDetailV2(payPensionsProfit: IncomeTypeBreakdownV2,
                             savingsAndGains: IncomeTypeBreakdownV2,
                             lumpSums: IncomeTypeBreakdownV2,
                             dividends: IncomeTypeBreakdownV2,
                             gainsOnLifePolicies: IncomeTypeBreakdownV2,
                             giftAid: GiftAidV2)

object IncomeTaxDetailV2 {
  implicit val format: OFormat[IncomeTaxDetailV2] = Json.format[IncomeTaxDetailV2]
}
