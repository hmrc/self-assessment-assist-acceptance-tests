/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.chargeableEventGainsIncome

import play.api.libs.json.{Json, OFormat}

case class ChargeableEventGainsIncome(totalOfAllGains: BigInt,
                                      totalGainsWithTaxPaid: Option[BigInt],
                                      gainsWithTaxPaidDetail: Option[Seq[GainsWithTaxPaidDetail]],
                                      totalGainsWithNoTaxPaidAndVoidedIsa: Option[BigInt],
                                      gainsWithNoTaxPaidAndVoidedIsaDetail: Option[Seq[GainsWithNoTaxPaidAndVoidedIsaDetail]],
                                      totalForeignGainsOnLifePoliciesTaxPaid: Option[BigInt],
                                      foreignGainsOnLifePoliciesTaxPaidDetail: Option[Seq[ForeignGainsOnLifePoliciesTaxPaidDetail]],
                                      totalForeignGainsOnLifePoliciesNoTaxPaid: Option[BigInt],
                                      foreignGainsOnLifePoliciesNoTaxPaidDetail: Option[Seq[ForeignGainsOnLifePoliciesNoTaxPaidDetail]])

object ChargeableEventGainsIncome {
  implicit val format: OFormat[ChargeableEventGainsIncome] = Json.format[ChargeableEventGainsIncome]
}