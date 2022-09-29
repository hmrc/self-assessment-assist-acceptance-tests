/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.chargeableEventGainsIncome

import play.api.libs.json.{Json, OFormat}

case class GainsWithTaxPaidDetail(`type`: String,
                                  customerReference: Option[String],
                                  gainAmount: Option[BigDecimal],
                                  yearsHeld: Option[BigInt],
                                  yearsHeldSinceLastGain: Option[BigInt])

object GainsWithTaxPaidDetail {
  implicit val format: OFormat[GainsWithTaxPaidDetail] = Json.format[GainsWithTaxPaidDetail]
}