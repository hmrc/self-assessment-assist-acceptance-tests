/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class Adjustments(countryLevelDetail: Option[Seq[AdjustmentsCountryLevelDetail]],
                       income: Option[AdjustmentsIncome],
                       expenses: Option[AdjustmentsExpenses])

object Adjustments {
  implicit val format: OFormat[Adjustments] = Json.format[Adjustments]
}
