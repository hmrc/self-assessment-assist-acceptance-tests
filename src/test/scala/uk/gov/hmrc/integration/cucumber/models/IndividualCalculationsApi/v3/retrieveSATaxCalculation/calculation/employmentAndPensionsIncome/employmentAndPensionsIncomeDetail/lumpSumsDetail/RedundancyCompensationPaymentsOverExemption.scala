/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.lumpSumsDetail

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsOverExemption(amount: Option[BigDecimal],
                                                       taxPaid: Option[BigDecimal],
                                                       taxTakenOffInEmployment: Option[Boolean])

object RedundancyCompensationPaymentsOverExemption {
  implicit val format: OFormat[RedundancyCompensationPaymentsOverExemption] = Json.format[RedundancyCompensationPaymentsOverExemption]
}