/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignIncome

import play.api.libs.json.{Json, OFormat}

case class AllOtherIncomeReceivedWhilstAbroadDetail(countryCode: String,
                                                    grossIncome: Option[BigDecimal],
                                                    netIncome: Option[BigDecimal],
                                                    taxDeducted: Option[BigDecimal],
                                                    foreignTaxCreditRelief: Option[Boolean])

object AllOtherIncomeReceivedWhilstAbroadDetail {
  implicit val format: OFormat[AllOtherIncomeReceivedWhilstAbroadDetail] = Json.format[AllOtherIncomeReceivedWhilstAbroadDetail]
}
