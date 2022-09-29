/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignFhlEea

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaExpenses(premisesRunningCosts: Option[BigDecimal],
                                 repairsAndMaintenance: Option[BigDecimal],
                                 financialCosts: Option[BigDecimal],
                                 professionalFees: Option[BigDecimal],
                                 costOfServices: Option[BigDecimal],
                                 travelCosts: Option[BigDecimal],
                                 other: Option[BigDecimal],
                                 consolidatedExpenses: Option[BigDecimal])

object ForeignFhlEeaExpenses {
  implicit val format: OFormat[ForeignFhlEeaExpenses] = Json.format[ForeignFhlEeaExpenses]
}
