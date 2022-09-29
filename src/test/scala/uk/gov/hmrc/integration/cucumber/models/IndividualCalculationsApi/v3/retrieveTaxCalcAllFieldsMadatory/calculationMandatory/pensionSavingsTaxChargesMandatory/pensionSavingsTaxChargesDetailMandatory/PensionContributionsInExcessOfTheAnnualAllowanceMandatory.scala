/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsInExcessOfTheAnnualAllowanceMandatory(totalContributions: BigDecimal,
                                                                     totalPensionCharge: BigDecimal,
                                                                     annualAllowanceTaxPaid: BigDecimal,
                                                                     totalPensionChargeDue: BigDecimal,
                                                                     pensionBands: Seq[PensionBandsMandatory])

object PensionContributionsInExcessOfTheAnnualAllowanceMandatory {
  implicit val format: OFormat[PensionContributionsInExcessOfTheAnnualAllowanceMandatory] = Json.format[PensionContributionsInExcessOfTheAnnualAllowanceMandatory]
}
