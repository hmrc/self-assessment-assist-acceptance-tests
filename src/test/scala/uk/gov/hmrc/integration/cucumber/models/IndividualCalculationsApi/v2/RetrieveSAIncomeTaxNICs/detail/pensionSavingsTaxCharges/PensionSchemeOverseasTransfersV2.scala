/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeOverseasTransfersV2(transferCharge: Option[BigDecimal],
                                            transferChargeTaxPaid: Option[BigDecimal],
                                            rate: Option[BigDecimal],
                                            chargeableAmount: Option[BigDecimal])

object PensionSchemeOverseasTransfersV2 {
  implicit val format: OFormat[PensionSchemeOverseasTransfersV2] = Json.format[PensionSchemeOverseasTransfersV2]
}
