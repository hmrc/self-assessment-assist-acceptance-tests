/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyRfcDetailV2(countryCode: String, amountClaimed: BigInt, allowableAmount: BigDecimal, carryForwardAmount: Option[BigDecimal])

object ForeignPropertyRfcDetailV2 {
  implicit val format: OFormat[ForeignPropertyRfcDetailV2] = Json.format[ForeignPropertyRfcDetailV2]
}
