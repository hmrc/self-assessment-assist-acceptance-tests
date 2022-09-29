/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class StudentLoanPlan(planType: String)

object StudentLoanPlan {
  implicit val format: OFormat[StudentLoanPlan] = Json.format[StudentLoanPlan]
}