/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}

case class Employment(employmentSequenceNumber: Option[String],
                      payrollId: Option[String],
                      companyDirector: Option[Boolean],
                      closeCompany: Option[Boolean],
                      directorshipCeasedDate: Option[String],
                      startDate: Option[String],
                      cessationDate: Option[String],
                      occupationalPension: Option[Boolean],
                      disguisedRemuneration: Option[Boolean],
                      employer: Employer,
                      pay: Option[Pay],
                      customerEstimatedPay: Option[CustomerEstimatedPay],
                      deductions: Option[Deductions],
                      benefitsInKind: Option[BenefitsInKind])

object Employment {
  implicit val format: OFormat[Employment] = Json.format[Employment]
}
