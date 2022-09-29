/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsInExcessOfTheAnnualAllowanceV2(totalContributions: BigDecimal,
                                                              totalPensionCharge: BigDecimal,
                                                              annualAllowanceTaxPaid: Option[BigDecimal],
                                                              totalPensionChargeDue: BigDecimal,
                                                              pensionBands: Option[Seq[PensionBandsV2]])

object PensionContributionsInExcessOfTheAnnualAllowanceV2 {
  implicit val format: OFormat[PensionContributionsInExcessOfTheAnnualAllowanceV2] = Json.format[PensionContributionsInExcessOfTheAnnualAllowanceV2]
}
