/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class GainsWithTaxPaidDetailMandatory(`type`: String,
                                           customerReference: String,
                                           gainAmount: BigDecimal,
                                           yearsHeld: BigInt,
                                           yearsHeldSinceLastGain: BigInt)

object GainsWithTaxPaidDetailMandatory {
  implicit val format: OFormat[GainsWithTaxPaidDetailMandatory] = Json.format[GainsWithTaxPaidDetailMandatory]
}