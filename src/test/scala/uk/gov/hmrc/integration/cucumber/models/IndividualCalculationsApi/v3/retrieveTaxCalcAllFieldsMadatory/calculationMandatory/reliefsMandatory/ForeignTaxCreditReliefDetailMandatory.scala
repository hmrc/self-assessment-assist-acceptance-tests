/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditReliefDetailMandatory(incomeSourceType: String,
                                                 incomeSourceId: String,
                                                 countryCode: String,
                                                 foreignIncome: BigDecimal,
                                                 foreignTax: BigDecimal,
                                                 dtaRate: BigDecimal,
                                                 dtaAmount: BigDecimal,
                                                 ukLiabilityOnIncome: BigDecimal,
                                                 foreignTaxCredit: BigDecimal,
                                                 employmentLumpSum: Boolean)

object ForeignTaxCreditReliefDetailMandatory {
  implicit val format: OFormat[ForeignTaxCreditReliefDetailMandatory] = Json.format[ForeignTaxCreditReliefDetailMandatory]
}