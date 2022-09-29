/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.stateBenefitsDetail

import play.api.libs.json.{Json, OFormat}

case class StatePension(incomeSourceId: String,
                        amount: BigDecimal,
                        source: Option[String])

object StatePension {
  implicit val format: OFormat[StatePension] = Json.format[StatePension]
}