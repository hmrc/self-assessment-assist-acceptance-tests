/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class Employer(employerRef: Option[String], employerName: String)

object Employer {
  implicit val format: OFormat[Employer] = Json.format[Employer]
}
