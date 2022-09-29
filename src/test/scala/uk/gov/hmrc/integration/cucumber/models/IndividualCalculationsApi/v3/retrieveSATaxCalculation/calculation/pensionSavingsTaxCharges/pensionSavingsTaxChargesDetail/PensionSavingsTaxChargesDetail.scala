/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionSavingsTaxChargesDetail(excessOfLifeTimeAllowance: Option[ExcessOfLifetimeAllowance],
                                          pensionSchemeUnauthorisedPayments: Option[PensionSchemeUnauthorisedPayments],
                                          pensionSchemeOverseasTransfers: Option[PensionSchemeOverseasTransfers],
                                          pensionContributionsInExcessOfTheAnnualAllowance: Option[PensionContributionsInExcessOfTheAnnualAllowance],
                                          overseasPensionContributions: Option[OverseasPensionContributions])

object PensionSavingsTaxChargesDetail {
  implicit val format: OFormat[PensionSavingsTaxChargesDetail] = Json.format[PensionSavingsTaxChargesDetail]
}