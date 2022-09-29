/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class Deductions(studentLoans: Option[StudentLoans])

object Deductions {
  implicit val format: OFormat[Deductions] = Json.format[Deductions]
}
