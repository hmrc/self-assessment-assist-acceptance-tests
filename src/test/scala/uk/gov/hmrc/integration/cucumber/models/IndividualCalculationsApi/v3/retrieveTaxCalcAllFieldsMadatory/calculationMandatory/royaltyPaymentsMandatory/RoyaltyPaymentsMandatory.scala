/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.royaltyPaymentsMandatory

import play.api.libs.json.{Json, OFormat}

case class RoyaltyPaymentsMandatory(royaltyPaymentsAmount: BigInt,
                                    rate: BigDecimal,
                                    grossRoyaltyPayments: BigInt)

object RoyaltyPaymentsMandatory {
  implicit val format: OFormat[RoyaltyPaymentsMandatory] = Json.format[RoyaltyPaymentsMandatory]
}