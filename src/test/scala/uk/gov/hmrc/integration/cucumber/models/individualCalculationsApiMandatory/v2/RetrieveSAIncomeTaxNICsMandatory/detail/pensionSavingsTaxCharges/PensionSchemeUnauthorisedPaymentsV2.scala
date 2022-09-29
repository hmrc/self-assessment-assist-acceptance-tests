/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeUnauthorisedPaymentsV2(totalChargeableAmount: BigDecimal,
                                               totalTaxPaid: BigDecimal,
                                               pensionSchemeUnauthorisedPaymentsSurcharge: PensionSavingsDetailBreakdownV2,
                                               pensionSchemeUnauthorisedPaymentsNonSurcharge: PensionSavingsDetailBreakdownV2)

object PensionSchemeUnauthorisedPaymentsV2 {
  implicit val format: OFormat[PensionSchemeUnauthorisedPaymentsV2] = Json.format[PensionSchemeUnauthorisedPaymentsV2]
}
