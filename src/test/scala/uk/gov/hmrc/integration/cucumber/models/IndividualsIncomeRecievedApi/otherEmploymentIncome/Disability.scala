/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class Disability(customerReference: Option[String], amountDeducted: BigDecimal)

object Disability {
  implicit val format: OFormat[Disability] = Json.format[Disability]
}
