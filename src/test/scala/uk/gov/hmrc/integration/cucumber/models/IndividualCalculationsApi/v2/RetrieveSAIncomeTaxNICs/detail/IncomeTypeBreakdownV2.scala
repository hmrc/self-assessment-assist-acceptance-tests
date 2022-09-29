/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class IncomeTypeBreakdownV2(allowancesAllocated: BigInt, incomeTaxAmount: BigDecimal, taxBands: Option[Seq[TaxBandV2]])

object IncomeTypeBreakdownV2 {
  implicit val format: OFormat[IncomeTypeBreakdownV2] = Json.format[IncomeTypeBreakdownV2]
}
