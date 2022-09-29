/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsDetailBreakdownV2(amount: Option[BigDecimal],
                                           taxPaid: Option[BigDecimal],
                                           rate: Option[BigDecimal],
                                           chargeableAmount: Option[BigDecimal])

object PensionSavingsDetailBreakdownV2 {
  implicit val format: OFormat[PensionSavingsDetailBreakdownV2] = Json.format[PensionSavingsDetailBreakdownV2]
}
