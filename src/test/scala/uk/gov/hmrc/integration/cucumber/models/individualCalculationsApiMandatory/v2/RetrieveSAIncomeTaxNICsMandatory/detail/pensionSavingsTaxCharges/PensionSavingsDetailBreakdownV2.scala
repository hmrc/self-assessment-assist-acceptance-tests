/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsDetailBreakdownV2(amount: BigDecimal, taxPaid: BigDecimal, rate: BigDecimal, chargeableAmount: BigDecimal)

object PensionSavingsDetailBreakdownV2 {
  implicit val format: OFormat[PensionSavingsDetailBreakdownV2] = Json.format[PensionSavingsDetailBreakdownV2]
}
