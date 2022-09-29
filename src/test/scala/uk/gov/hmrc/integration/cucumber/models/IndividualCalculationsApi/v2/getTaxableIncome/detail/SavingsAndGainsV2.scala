/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class SavingsAndGainsV2(incomeReceived: BigInt,
                             taxableIncome: BigInt,
                             totalOfAllGains: Option[BigInt],
                             totalUkSavingsAndSecurities: Option[BigInt],
                             totalGainsWithNoTaxPaidAndVoidedIsa: Option[BigInt],
                             totalForeignGainsOnLifePoliciesNoTaxPaid: Option[BigInt],
                             totalForeignSavingsAndGainsIncome: Option[BigInt],
                             ukSavings: Option[Seq[UkSavingsV2]],
                             ukSecurities: Option[Seq[UkSecuritiesV2]])

object SavingsAndGainsV2 {
  implicit val formats: OFormat[SavingsAndGainsV2] = Json.format[SavingsAndGainsV2]
}
