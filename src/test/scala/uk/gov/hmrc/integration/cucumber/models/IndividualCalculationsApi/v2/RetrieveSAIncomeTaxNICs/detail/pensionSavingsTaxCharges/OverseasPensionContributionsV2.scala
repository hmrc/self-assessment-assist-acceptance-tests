/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionContributionsV2(totalShortServiceRefund: BigDecimal,
                                          totalShortServiceRefundCharge: BigDecimal,
                                          shortServiceRefundTaxPaid: Option[BigDecimal],
                                          totalShortServiceRefundChargeDue: BigDecimal,
                                          shortServiceRefundBands: Option[Seq[ShortServiceRefundBandsV2]])

object OverseasPensionContributionsV2 {
  implicit val format: OFormat[OverseasPensionContributionsV2] = Json.format[OverseasPensionContributionsV2]
}
