/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignDividendsMandatory(incomeSourceType: String,
                                     countryCode: String,
                                     grossIncome: BigDecimal,
                                     netIncome: BigDecimal,
                                     taxDeducted: BigDecimal,
                                     foreignTaxCreditRelief: Boolean)

object ForeignDividendsMandatory {
  implicit val format: OFormat[ForeignDividendsMandatory] = Json.format[ForeignDividendsMandatory]
}