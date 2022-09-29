/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class NicBandV2(name: String, rate: BigDecimal, threshold: BigInt, apportionedThreshold: BigInt, income: BigInt, amount: BigDecimal)

object NicBandV2 {
  implicit val format: OFormat[NicBandV2] = Json.format[NicBandV2]
}
