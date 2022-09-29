/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.stateBenefitsDetail

import play.api.libs.json.{Json, OFormat}

case class StatePensionLumpSum(incomeSourceId: String,
                               amount: BigDecimal,
                               taxPaid: Option[BigDecimal],
                               rate: BigDecimal,
                               source: Option[String])

object StatePensionLumpSum {
  implicit val format: OFormat[StatePensionLumpSum] = Json.format[StatePensionLumpSum]
}