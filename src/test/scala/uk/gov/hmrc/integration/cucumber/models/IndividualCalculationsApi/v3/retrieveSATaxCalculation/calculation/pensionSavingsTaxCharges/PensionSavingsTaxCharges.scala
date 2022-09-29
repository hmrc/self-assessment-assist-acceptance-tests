/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail.PensionSavingsTaxChargesDetail

case class PensionSavingsTaxCharges(totalPensionCharges: Option[BigDecimal],
                                    totalTaxPaid: Option[BigDecimal],
                                    totalPensionChargesDue: Option[BigDecimal],
                                    pensionSavingsTaxChargesDetail: Option[PensionSavingsTaxChargesDetail])

object PensionSavingsTaxCharges {
  implicit val format: OFormat[PensionSavingsTaxCharges] = Json.format[PensionSavingsTaxCharges]
}