/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditReliefDetail(incomeSourceType: Option[String],
                                        incomeSourceId: Option[String],
                                        countryCode: String,
                                        foreignIncome: BigDecimal,
                                        foreignTax: Option[BigDecimal],
                                        dtaRate: Option[BigDecimal],
                                        dtaAmount: Option[BigDecimal],
                                        ukLiabilityOnIncome: Option[BigDecimal],
                                        foreignTaxCredit: BigDecimal,
                                        employmentLumpSum: Option[Boolean])

object ForeignTaxCreditReliefDetail {
  implicit val format: OFormat[ForeignTaxCreditReliefDetail] = Json.format[ForeignTaxCreditReliefDetail]
}