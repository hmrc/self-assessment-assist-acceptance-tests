/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionSchemeOverseasTransfers(transferCharge: Option[BigDecimal],
                                          transferChargeTaxPaid: Option[BigDecimal],
                                          rate: Option[BigDecimal],
                                          chargeableAmount: Option[BigDecimal])

object PensionSchemeOverseasTransfers {
  implicit val format: OFormat[PensionSchemeOverseasTransfers] = Json.format[PensionSchemeOverseasTransfers]
}
