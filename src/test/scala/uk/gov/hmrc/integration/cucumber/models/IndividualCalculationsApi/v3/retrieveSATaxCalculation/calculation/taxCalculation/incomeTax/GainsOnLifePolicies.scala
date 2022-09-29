/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.incomeTax

import play.api.libs.json.{Json, OFormat}

case class GainsOnLifePolicies(incomeReceived: BigInt,
                               allowancesAllocated: BigInt,
                               taxableIncome: BigInt,
                               incomeTaxAmount: BigDecimal,
                               taxBands: Option[Seq[TaxBands]])

object GainsOnLifePolicies {
  implicit val format: OFormat[GainsOnLifePolicies] = Json.format[GainsOnLifePolicies]
}