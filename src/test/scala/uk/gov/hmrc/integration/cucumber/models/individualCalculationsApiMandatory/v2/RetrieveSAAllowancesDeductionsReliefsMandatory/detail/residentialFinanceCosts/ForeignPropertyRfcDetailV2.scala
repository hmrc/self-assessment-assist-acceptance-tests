/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyRfcDetailV2(countryCode: String, amountClaimed: BigInt, allowableAmount: BigDecimal, carryForwardAmount: BigDecimal)

object ForeignPropertyRfcDetailV2 {
  implicit val format: OFormat[ForeignPropertyRfcDetailV2] = Json.format[ForeignPropertyRfcDetailV2]
}
