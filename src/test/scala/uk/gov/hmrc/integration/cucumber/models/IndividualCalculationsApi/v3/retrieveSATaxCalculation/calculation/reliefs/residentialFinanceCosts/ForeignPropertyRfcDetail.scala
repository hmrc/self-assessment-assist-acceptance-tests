/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyRfcDetail(countryCode: String,
                                    amountClaimed: BigInt,
                                    allowableAmount: BigDecimal,
                                    carryForwardAmount: Option[BigDecimal])

object ForeignPropertyRfcDetail {
  implicit val format: OFormat[ForeignPropertyRfcDetail] = Json.format[ForeignPropertyRfcDetail]
}
