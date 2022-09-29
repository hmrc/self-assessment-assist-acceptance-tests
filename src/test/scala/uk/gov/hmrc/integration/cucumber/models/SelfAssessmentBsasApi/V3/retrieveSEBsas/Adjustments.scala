/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class Adjustments(income: Option[AdjustmentsIncome], expenses: Option[AdjustmentsExpenses], additions: Option[AdjustmentsAdditions])

object Adjustments {
  implicit val format: OFormat[Adjustments] = Json.format[Adjustments]
}
