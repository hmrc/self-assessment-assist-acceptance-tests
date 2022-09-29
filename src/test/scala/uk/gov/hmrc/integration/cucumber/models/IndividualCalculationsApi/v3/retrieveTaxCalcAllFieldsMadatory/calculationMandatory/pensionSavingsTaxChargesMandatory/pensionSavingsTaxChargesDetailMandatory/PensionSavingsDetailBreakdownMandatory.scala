/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsDetailBreakdownMandatory(amount: BigDecimal,
                                                  taxPaid: BigDecimal,
                                                  rate: BigDecimal,
                                                  chargeableAmount: BigDecimal)

object PensionSavingsDetailBreakdownMandatory {
  implicit val format: OFormat[PensionSavingsDetailBreakdownMandatory] = Json.format[PensionSavingsDetailBreakdownMandatory]
}
