/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionContributions(totalShortServiceRefund: BigDecimal,
                                        totalShortServiceRefundCharge: BigDecimal,
                                        shortServiceRefundTaxPaid: Option[BigDecimal],
                                        totalShortServiceRefundChargeDue: BigDecimal,
                                        shortServiceRefundBands: Option[Seq[ShortServiceRefundBands]])

object OverseasPensionContributions {
  implicit val format: OFormat[OverseasPensionContributions] = Json.format[OverseasPensionContributions]
}
