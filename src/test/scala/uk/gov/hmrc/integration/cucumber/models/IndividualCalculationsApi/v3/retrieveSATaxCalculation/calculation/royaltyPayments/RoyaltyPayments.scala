/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.royaltyPayments

import play.api.libs.json.{Json, OFormat}

case class RoyaltyPayments(royaltyPaymentsAmount: BigInt,
                           rate: BigDecimal,
                           grossRoyaltyPayments: Option[BigInt])

object RoyaltyPayments {
  implicit val format: OFormat[RoyaltyPayments] = Json.format[RoyaltyPayments]
}