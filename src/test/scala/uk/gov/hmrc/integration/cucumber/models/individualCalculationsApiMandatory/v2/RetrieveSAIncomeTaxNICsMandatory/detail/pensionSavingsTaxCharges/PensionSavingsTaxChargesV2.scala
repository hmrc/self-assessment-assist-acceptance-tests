/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesV2(totalPensionCharges: BigDecimal,
                                      totalTaxPaid: BigDecimal,
                                      totalPensionChargesDue: BigDecimal,
                                      pensionSavingsTaxChargesDetail: PensionSavingsTaxChargesDetailV2)

object PensionSavingsTaxChargesV2 {
  implicit val format: OFormat[PensionSavingsTaxChargesV2] = Json.format[PensionSavingsTaxChargesV2]
}
