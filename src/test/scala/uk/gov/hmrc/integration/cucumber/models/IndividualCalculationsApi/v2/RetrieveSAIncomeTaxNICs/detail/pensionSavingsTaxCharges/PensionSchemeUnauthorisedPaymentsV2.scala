/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeUnauthorisedPaymentsV2(totalChargeableAmount: Option[BigDecimal],
                                               totalTaxPaid: Option[BigDecimal],
                                               pensionSchemeUnauthorisedPaymentsSurcharge: Option[PensionSavingsDetailBreakdownV2],
                                               pensionSchemeUnauthorisedPaymentsNonSurcharge: Option[PensionSavingsDetailBreakdownV2])

object PensionSchemeUnauthorisedPaymentsV2 {
  implicit val format: OFormat[PensionSchemeUnauthorisedPaymentsV2] = Json.format[PensionSchemeUnauthorisedPaymentsV2]
}
