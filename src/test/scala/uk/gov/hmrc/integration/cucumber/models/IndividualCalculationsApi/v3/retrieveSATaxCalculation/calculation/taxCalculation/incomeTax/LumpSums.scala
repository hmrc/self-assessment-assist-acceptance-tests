/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.incomeTax

import play.api.libs.json.{Json, OFormat}

case class LumpSums(incomeReceived: BigInt,
                    allowancesAllocated: BigInt,
                    taxableIncome: BigInt,
                    incomeTaxAmount: BigDecimal,
                    taxBands: Option[Seq[TaxBands]])

object LumpSums {
  implicit val format: OFormat[LumpSums] = Json.format[LumpSums]
}