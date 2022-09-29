/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class Losses(broughtForwardLossesUsedInCurrentYear: Option[BigDecimal],
                  setAgainstInYearGains: Option[BigDecimal],
                  setAgainstInYearGeneralIncome: Option[BigDecimal],
                  setAgainstEarlierYear: Option[BigDecimal])

object Losses {
  implicit val format: OFormat[Losses] = Json.format[Losses]
}
