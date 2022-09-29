/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionContributionsMandatory(totalShortServiceRefund: BigDecimal,
                                                 totalShortServiceRefundCharge: BigDecimal,
                                                 shortServiceRefundTaxPaid: BigDecimal,
                                                 totalShortServiceRefundChargeDue: BigDecimal,
                                                 shortServiceRefundBands: Seq[ShortServiceRefundBandsMandatory])

object OverseasPensionContributionsMandatory {
  implicit val format: OFormat[OverseasPensionContributionsMandatory] = Json.format[OverseasPensionContributionsMandatory]
}
