/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditReliefV2(customerCalculatedRelief: Option[Boolean],
                                    totalForeignTaxCreditRelief: BigDecimal,
                                    foreignTaxCreditReliefOnProperty: Option[BigDecimal],
                                    foreignTaxCreditReliefOnDividends: Option[BigDecimal],
                                    foreignTaxCreditReliefOnSavings: Option[BigDecimal],
                                    foreignTaxCreditReliefOnForeignIncome: Option[BigDecimal])

object ForeignTaxCreditReliefV2 {
  implicit val format: OFormat[ForeignTaxCreditReliefV2] = Json.format[ForeignTaxCreditReliefV2]
}
