/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory.PensionSavingsTaxChargesDetailMandatory

case class PensionSavingsTaxChargesMandatory(totalPensionCharges: BigDecimal,
                                             totalTaxPaid: BigDecimal,
                                             totalPensionChargesDue: BigDecimal,
                                             pensionSavingsTaxChargesDetail: PensionSavingsTaxChargesDetailMandatory)

object PensionSavingsTaxChargesMandatory {
  implicit val format: OFormat[PensionSavingsTaxChargesMandatory] = Json.format[PensionSavingsTaxChargesMandatory]
}