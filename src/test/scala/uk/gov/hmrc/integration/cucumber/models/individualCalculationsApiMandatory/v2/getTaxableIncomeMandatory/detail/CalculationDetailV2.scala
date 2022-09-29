/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class CalculationDetailV2(payPensionsProfit: PayPensionsProfitV2,
                               savingsAndGains: SavingsAndGainsV2,
                               dividends: DividendsV2,
                               lumpSums: LumpSumsV2,
                               gainsOnLifePolicies: GainsOnLifePoliciesV2)

object CalculationDetailV2 {
  implicit val format: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
