/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionContributionsV2(totalShortServiceRefund: BigDecimal,
                                          totalShortServiceRefundCharge: BigDecimal,
                                          shortServiceRefundTaxPaid: BigDecimal,
                                          totalShortServiceRefundChargeDue: BigDecimal,
                                          shortServiceRefundBands: Seq[ShortServiceRefundBandsV2])

object OverseasPensionContributionsV2 {
  implicit val format: OFormat[OverseasPensionContributionsV2] = Json.format[OverseasPensionContributionsV2]
}
