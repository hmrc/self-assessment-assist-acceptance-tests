/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.adjustments

import play.api.libs.json.{Json, OFormat}

case class Adjustments(incomes: Option[Incomes], expenses: Option[Expenses])

object Adjustments {
  implicit val format: OFormat[Adjustments] = Json.format[Adjustments]
}
