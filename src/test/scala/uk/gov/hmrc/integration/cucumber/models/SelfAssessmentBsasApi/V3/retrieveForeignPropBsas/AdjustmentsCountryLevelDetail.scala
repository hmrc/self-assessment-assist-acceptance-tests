/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsCountryLevelDetail(countryCode: Option[String],
                                         income: Option[SummaryCalculationIncome],
                                         expenses: Option[AdjustmentsCountryLevelExpenses])

object AdjustmentsCountryLevelDetail {
  implicit val format: OFormat[AdjustmentsCountryLevelDetail] = Json.format[AdjustmentsCountryLevelDetail]
}
