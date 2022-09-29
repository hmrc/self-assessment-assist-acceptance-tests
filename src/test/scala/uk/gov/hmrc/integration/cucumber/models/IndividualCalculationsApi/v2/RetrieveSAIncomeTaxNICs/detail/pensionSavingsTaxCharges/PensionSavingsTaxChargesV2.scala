/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesV2(totalPensionCharges: Option[BigDecimal],
                                      totalTaxPaid: Option[BigDecimal],
                                      totalPensionChargesDue: Option[BigDecimal],
                                      pensionSavingsTaxChargesDetail: Option[PensionSavingsTaxChargesDetailV2])

object PensionSavingsTaxChargesV2 {
  implicit val format: OFormat[PensionSavingsTaxChargesV2] = Json.format[PensionSavingsTaxChargesV2]
}
