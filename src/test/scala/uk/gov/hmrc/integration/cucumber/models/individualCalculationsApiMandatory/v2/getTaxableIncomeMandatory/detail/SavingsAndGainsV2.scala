/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class SavingsAndGainsV2(incomeReceived: BigInt,
                             taxableIncome: BigInt,
                             totalOfAllGains: BigInt,
                             totalUkSavingsAndSecurities: BigInt,
                             totalGainsWithNoTaxPaidAndVoidedIsa: BigInt,
                             totalForeignGainsOnLifePoliciesNoTaxPaid: BigInt,
                             totalForeignSavingsAndGainsIncome: BigInt,
                             ukSavings: Seq[UkSavingsV2],
                             ukSecurities: Seq[UkSecuritiesV2])

object SavingsAndGainsV2 {
  implicit val format: OFormat[SavingsAndGainsV2] = Json.format[SavingsAndGainsV2]
}
