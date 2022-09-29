/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeUnauthorisedPaymentsMandatory(totalChargeableAmount: BigDecimal,
                                                      totalTaxPaid: BigDecimal,
                                                      pensionSchemeUnauthorisedPaymentsSurcharge: PensionSavingsDetailBreakdownMandatory,
                                                      pensionSchemeUnauthorisedPaymentsNonSurcharge: PensionSavingsDetailBreakdownMandatory)

object PensionSchemeUnauthorisedPaymentsMandatory {
  implicit val format: OFormat[PensionSchemeUnauthorisedPaymentsMandatory] = Json.format[PensionSchemeUnauthorisedPaymentsMandatory]
}
