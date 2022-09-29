/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsDetailBreakdown(amount: Option[BigDecimal],
                                         taxPaid: Option[BigDecimal],
                                         rate: Option[BigDecimal],
                                         chargeableAmount: Option[BigDecimal])

object PensionSavingsDetailBreakdown {
  implicit val format: OFormat[PensionSavingsDetailBreakdown] = Json.format[PensionSavingsDetailBreakdown]
}
