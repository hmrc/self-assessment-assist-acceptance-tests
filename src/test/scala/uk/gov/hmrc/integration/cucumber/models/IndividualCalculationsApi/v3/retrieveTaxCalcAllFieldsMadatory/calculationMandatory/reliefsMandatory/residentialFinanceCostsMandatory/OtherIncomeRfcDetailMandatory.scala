/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory

import play.api.libs.json.{Json, OFormat}

case class OtherIncomeRfcDetailMandatory(countryCode: String,
                                         residentialFinancialCostAmount: BigDecimal,
                                         broughtFwdResidentialFinancialCostAmount: BigDecimal)

object OtherIncomeRfcDetailMandatory {
  implicit val format: OFormat[OtherIncomeRfcDetailMandatory] = Json.format[OtherIncomeRfcDetailMandatory]
}
