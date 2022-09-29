/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class CalculationDetailV2(payPensionsProfit: Option[PayPensionsProfitV2],
                               savingsAndGains: Option[SavingsAndGainsV2],
                               dividends: Option[DividendsV2],
                               lumpSums: Option[LumpSumsV2],
                               gainsOnLifePolicies: Option[GainsOnLifePoliciesV2])

object CalculationDetailV2 {
  implicit val formats: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
