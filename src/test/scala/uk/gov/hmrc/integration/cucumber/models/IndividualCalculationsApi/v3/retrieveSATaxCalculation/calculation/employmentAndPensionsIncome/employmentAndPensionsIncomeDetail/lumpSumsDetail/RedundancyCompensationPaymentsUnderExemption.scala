/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.lumpSumsDetail

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsUnderExemption(amount: Option[BigDecimal])

object RedundancyCompensationPaymentsUnderExemption {
  implicit val format: OFormat[RedundancyCompensationPaymentsUnderExemption] = Json.format[RedundancyCompensationPaymentsUnderExemption]
}