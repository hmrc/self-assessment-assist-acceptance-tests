/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class TaxBandV2(name: String, rate: BigDecimal, bandLimit: BigInt, apportionedBandLimit: BigInt, income: BigInt, taxAmount: BigDecimal)

object TaxBandV2 {
  implicit val format: OFormat[TaxBandV2] = Json.format[TaxBandV2]
}
