/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionSavingsTaxCharges.pensionSavingsTaxChargesDetail

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsInExcessOfTheAnnualAllowance(totalContributions: BigDecimal,
                                                            totalPensionCharge: BigDecimal,
                                                            annualAllowanceTaxPaid: Option[BigDecimal],
                                                            totalPensionChargeDue: BigDecimal,
                                                            pensionBands: Option[Seq[PensionBands]])

object PensionContributionsInExcessOfTheAnnualAllowance {
  implicit val format: OFormat[PensionContributionsInExcessOfTheAnnualAllowance] = Json.format[PensionContributionsInExcessOfTheAnnualAllowance]
}
