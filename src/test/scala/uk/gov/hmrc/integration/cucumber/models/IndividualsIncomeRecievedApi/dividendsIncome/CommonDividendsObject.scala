/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class CommonDividendsObject(customerReference: Option[String], grossAmount: BigDecimal)

object CommonDividendsObject {
  implicit val format: OFormat[CommonDividendsObject] = Json.format[CommonDividendsObject]
}
