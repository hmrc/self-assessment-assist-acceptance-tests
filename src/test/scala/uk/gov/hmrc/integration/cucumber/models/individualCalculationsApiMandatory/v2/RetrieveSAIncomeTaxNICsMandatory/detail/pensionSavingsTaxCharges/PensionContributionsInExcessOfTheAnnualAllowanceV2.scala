/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsInExcessOfTheAnnualAllowanceV2(totalContributions: BigDecimal,
                                                              totalPensionCharge: BigDecimal,
                                                              annualAllowanceTaxPaid: BigDecimal,
                                                              totalPensionChargeDue: BigDecimal,
                                                              pensionBands: Seq[PensionBandsV2])

object PensionContributionsInExcessOfTheAnnualAllowanceV2 {
  implicit val format: OFormat[PensionContributionsInExcessOfTheAnnualAllowanceV2] = Json.format[PensionContributionsInExcessOfTheAnnualAllowanceV2]
}
