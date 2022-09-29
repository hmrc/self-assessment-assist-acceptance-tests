/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class IncomeTypeBreakdownV2(allowancesAllocated: BigInt, incomeTaxAmount: BigDecimal, taxBands: Seq[TaxBandV2])

object IncomeTypeBreakdownV2 {
  implicit val format: OFormat[IncomeTypeBreakdownV2] = Json.format[IncomeTypeBreakdownV2]
}
