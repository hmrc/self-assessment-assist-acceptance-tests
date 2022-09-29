/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class UkDividends(incomeSourceId: Option[String],
                       incomeSourceType: Option[String],
                       dividends: Option[BigInt],
                       otherUkDividends: Option[BigInt])

object UkDividends {
  implicit val format: OFormat[UkDividends] = Json.format[UkDividends]
}