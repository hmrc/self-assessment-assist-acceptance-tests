/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class StudentLoanPlanMandatory(planType: String)

object StudentLoanPlanMandatory {
  implicit val format: OFormat[StudentLoanPlanMandatory] = Json.format[StudentLoanPlanMandatory]
}