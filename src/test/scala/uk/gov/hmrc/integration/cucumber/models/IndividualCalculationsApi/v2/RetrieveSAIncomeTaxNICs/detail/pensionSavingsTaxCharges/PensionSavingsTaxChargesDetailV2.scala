/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesDetailV2(
    excessOfLifetimeAllowance: Option[ExcessOfLifetimeAllowanceV2],
    pensionSchemeUnauthorisedPayments: Option[PensionSchemeUnauthorisedPaymentsV2],
    pensionSchemeOverseasTransfers: Option[PensionSchemeOverseasTransfersV2],
    pensionContributionsInExcessOfTheAnnualAllowance: Option[PensionContributionsInExcessOfTheAnnualAllowanceV2],
    overseasPensionContributions: Option[OverseasPensionContributionsV2])

object PensionSavingsTaxChargesDetailV2 {
  implicit val format: OFormat[PensionSavingsTaxChargesDetailV2] = Json.format[PensionSavingsTaxChargesDetailV2]
}
