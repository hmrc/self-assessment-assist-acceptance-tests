/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.stateBenefitsDetail

import play.api.libs.json.{Json, OFormat}

case class JobSeekersAllowance(incomeSourceId: String,
                               amount: BigDecimal,
                               taxPaid: Option[BigDecimal],
                               source: Option[String])

object JobSeekersAllowance {
  implicit val format: OFormat[JobSeekersAllowance] = Json.format[JobSeekersAllowance]
}