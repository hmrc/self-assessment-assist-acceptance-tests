/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionSavingsTaxChargesMandatory.pensionSavingsTaxChargesDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesDetailMandatory(excessOfLifeTimeAllowance: ExcessOfLifetimeAllowanceMandatory,
                                                   pensionSchemeUnauthorisedPayments: PensionSchemeUnauthorisedPaymentsMandatory,
                                                   pensionSchemeOverseasTransfers: PensionSchemeOverseasTransfersMandatory,
                                                   pensionContributionsInExcessOfTheAnnualAllowance: PensionContributionsInExcessOfTheAnnualAllowanceMandatory,
                                                   overseasPensionContributions: OverseasPensionContributionsMandatory)

object PensionSavingsTaxChargesDetailMandatory {
  implicit val format: OFormat[PensionSavingsTaxChargesDetailMandatory] = Json.format[PensionSavingsTaxChargesDetailMandatory]
}