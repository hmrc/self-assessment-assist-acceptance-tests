/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class GainsWithNoTaxPaidAndVoidedIsaDetailMandatory(`type`: String,
                                                         customerReference: Option[String],
                                                         gainAmount: Option[BigDecimal],
                                                         yearsHeld: Option[BigInt],
                                                         yearsHeldSinceLastGain: Option[BigInt],
                                                         voidedIsaTaxPaid: Option[BigDecimal])

object GainsWithNoTaxPaidAndVoidedIsaDetailMandatory {
  implicit val format: OFormat[GainsWithNoTaxPaidAndVoidedIsaDetailMandatory] = Json.format[GainsWithNoTaxPaidAndVoidedIsaDetailMandatory]
}