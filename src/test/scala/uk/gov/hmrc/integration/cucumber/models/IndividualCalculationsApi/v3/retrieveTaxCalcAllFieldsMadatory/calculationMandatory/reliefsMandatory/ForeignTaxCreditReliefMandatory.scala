/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditReliefMandatory(customerCalculatedRelief: Boolean,
                                           totalForeignTaxCreditRelief: BigDecimal,
                                           foreignTaxCreditReliefOnProperty: BigDecimal,
                                           foreignTaxCreditReliefOnDividends: BigDecimal,
                                           foreignTaxCreditReliefOnSavings: BigDecimal,
                                           foreignTaxCreditReliefOnForeignIncome: BigDecimal,
                                           foreignTaxCreditReliefDetail: Seq[ForeignTaxCreditReliefDetailMandatory])

object ForeignTaxCreditReliefMandatory {
  implicit val format: OFormat[ForeignTaxCreditReliefMandatory] = Json.format[ForeignTaxCreditReliefMandatory]
}
