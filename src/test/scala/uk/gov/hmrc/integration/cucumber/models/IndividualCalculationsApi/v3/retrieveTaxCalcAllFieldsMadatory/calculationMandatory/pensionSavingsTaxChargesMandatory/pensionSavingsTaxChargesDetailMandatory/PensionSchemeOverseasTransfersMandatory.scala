/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeOverseasTransfersMandatory(transferCharge: BigDecimal,
                                                   transferChargeTaxPaid: BigDecimal,
                                                   rate: BigDecimal,
                                                   chargeableAmount: BigDecimal)

object PensionSchemeOverseasTransfersMandatory {
  implicit val format: OFormat[PensionSchemeOverseasTransfersMandatory] = Json.format[PensionSchemeOverseasTransfersMandatory]
}
