/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.stateBenefitsDetail

import play.api.libs.json.{Json, OFormat}

case class BereavementAllowance(incomeSourceId: String,
                                amount: BigDecimal,
                                source: Option[String])

object BereavementAllowance {
  implicit val format: OFormat[BereavementAllowance] = Json.format[BereavementAllowance]
}