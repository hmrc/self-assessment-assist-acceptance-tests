/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeOverseasTransfersV2(transferCharge: BigDecimal,
                                            transferChargeTaxPaid: BigDecimal,
                                            rate: BigDecimal,
                                            chargeableAmount: BigDecimal)

object PensionSchemeOverseasTransfersV2 {
  implicit val format: OFormat[PensionSchemeOverseasTransfersV2] = Json.format[PensionSchemeOverseasTransfersV2]
}
