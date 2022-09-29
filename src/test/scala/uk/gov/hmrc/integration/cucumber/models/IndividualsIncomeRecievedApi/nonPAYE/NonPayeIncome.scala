/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.nonPAYE

import play.api.libs.json.{Json, OFormat}

case class NonPayeIncome(tips: Option[BigDecimal])

object NonPayeIncome {
  implicit val format: OFormat[NonPayeIncome] = Json.format[NonPayeIncome]
}
