/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class OtherIncomeRfcDetailV2(countryCode: String,
                                  residentialFinancialCostAmount: Option[BigDecimal],
                                  broughtFwdResidentialFinancialCostAmount: Option[BigDecimal])

object OtherIncomeRfcDetailV2 {
  implicit val format: OFormat[OtherIncomeRfcDetailV2] = Json.format[OtherIncomeRfcDetailV2]
}
