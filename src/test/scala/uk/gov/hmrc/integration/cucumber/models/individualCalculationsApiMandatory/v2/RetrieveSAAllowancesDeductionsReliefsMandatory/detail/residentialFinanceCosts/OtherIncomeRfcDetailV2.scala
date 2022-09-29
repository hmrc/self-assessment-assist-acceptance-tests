/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class OtherIncomeRfcDetailV2(countryCode: String,
                                  residentialFinancialCostAmount: BigDecimal,
                                  broughtFwdResidentialFinancialCostAmount: BigDecimal)

object OtherIncomeRfcDetailV2 {
  implicit val format: OFormat[OtherIncomeRfcDetailV2] = Json.format[OtherIncomeRfcDetailV2]
}
