/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeUnauthorisedPayments(totalChargeableAmount: Option[BigDecimal],
                                             totalTaxPaid: Option[BigDecimal],
                                             pensionSchemeUnauthorisedPaymentsSurcharge: Option[PensionSavingsDetailBreakdown],
                                             pensionSchemeUnauthorisedPaymentsNonSurcharge: Option[PensionSavingsDetailBreakdown])

object PensionSchemeUnauthorisedPayments {
  implicit val format: OFormat[PensionSchemeUnauthorisedPayments] = Json.format[PensionSchemeUnauthorisedPayments]
}
