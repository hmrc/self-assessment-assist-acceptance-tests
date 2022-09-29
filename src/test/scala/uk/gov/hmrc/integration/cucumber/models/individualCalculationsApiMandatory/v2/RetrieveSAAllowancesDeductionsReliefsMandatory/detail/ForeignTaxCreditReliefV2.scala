/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditReliefV2(customerCalculatedRelief: Boolean,
                                    totalForeignTaxCreditRelief: BigDecimal,
                                    foreignTaxCreditReliefOnProperty: BigDecimal,
                                    foreignTaxCreditReliefOnDividends: BigDecimal,
                                    foreignTaxCreditReliefOnSavings: BigDecimal,
                                    foreignTaxCreditReliefOnForeignIncome: BigDecimal)

object ForeignTaxCreditReliefV2 {
  implicit val format: OFormat[ForeignTaxCreditReliefV2] = Json.format[ForeignTaxCreditReliefV2]
}
