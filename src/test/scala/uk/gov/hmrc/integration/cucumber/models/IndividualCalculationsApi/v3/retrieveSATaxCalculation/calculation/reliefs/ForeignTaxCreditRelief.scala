/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditRelief(customerCalculatedRelief: Option[Boolean],
                                  totalForeignTaxCreditRelief: BigDecimal,
                                  foreignTaxCreditReliefOnProperty: Option[BigDecimal],
                                  foreignTaxCreditReliefOnDividends: Option[BigDecimal],
                                  foreignTaxCreditReliefOnSavings: Option[BigDecimal],
                                  foreignTaxCreditReliefOnForeignIncome: Option[BigDecimal],
                                  foreignTaxCreditReliefDetail: Option[Seq[ForeignTaxCreditReliefDetail]])

object ForeignTaxCreditRelief {
  implicit val format: OFormat[ForeignTaxCreditRelief] = Json.format[ForeignTaxCreditRelief]
}
