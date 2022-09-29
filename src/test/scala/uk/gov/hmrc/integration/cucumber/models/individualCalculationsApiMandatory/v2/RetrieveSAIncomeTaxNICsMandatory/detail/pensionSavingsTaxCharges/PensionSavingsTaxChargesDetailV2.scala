/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesDetailV2(excessOfLifetimeAllowance: ExcessOfLifetimeAllowanceV2,
                                            pensionSchemeUnauthorisedPayments: PensionSchemeUnauthorisedPaymentsV2,
                                            pensionSchemeOverseasTransfers: PensionSchemeOverseasTransfersV2,
                                            pensionContributionsInExcessOfTheAnnualAllowance: PensionContributionsInExcessOfTheAnnualAllowanceV2,
                                            overseasPensionContributions: OverseasPensionContributionsV2)

object PensionSavingsTaxChargesDetailV2 {
  implicit val format: OFormat[PensionSavingsTaxChargesDetailV2] = Json.format[PensionSavingsTaxChargesDetailV2]
}
