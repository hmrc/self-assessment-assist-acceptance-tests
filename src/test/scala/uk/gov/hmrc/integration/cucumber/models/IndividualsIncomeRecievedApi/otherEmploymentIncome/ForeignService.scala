/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignService(customerReference: Option[String], amountDeducted: BigDecimal)

object ForeignService {
  implicit val format: OFormat[ForeignService] = Json.format[ForeignService]
}
