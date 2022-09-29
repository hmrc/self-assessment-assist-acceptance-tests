/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class OtherIncomeRfcDetail(countryCode: String,
                                residentialFinancialCostAmount: Option[BigDecimal],
                                broughtFwdResidentialFinancialCostAmount: Option[BigDecimal])

object OtherIncomeRfcDetail {
  implicit val format: OFormat[OtherIncomeRfcDetail] = Json.format[OtherIncomeRfcDetail]
}
