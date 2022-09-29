/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class StudentLoans(uglDeductionAmount: Option[BigDecimal], pglDeductionAmount: Option[BigDecimal])

object StudentLoans {
  implicit val format: OFormat[StudentLoans] = Json.format[StudentLoans]
}
