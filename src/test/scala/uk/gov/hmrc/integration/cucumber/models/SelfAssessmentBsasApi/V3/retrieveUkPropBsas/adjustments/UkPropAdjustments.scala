/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustments

import play.api.libs.json.{Json, OFormat}

case class UkPropAdjustments(income: Option[UkPropAdjustmentsIncome], expenses: Option[UkPropAdjustmentsExpenses])

object UkPropAdjustments {
  implicit val format: OFormat[UkPropAdjustments] = Json.format[UkPropAdjustments]
}
