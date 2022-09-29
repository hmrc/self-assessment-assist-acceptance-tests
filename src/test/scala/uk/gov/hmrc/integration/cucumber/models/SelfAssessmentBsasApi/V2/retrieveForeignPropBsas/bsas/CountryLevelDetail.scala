/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.bsas

import play.api.libs.json.{Json, OFormat}

case class CountryLevelDetail(countryCode: String, total: Total, incomeBreakdown: IncomeBreakdown, expensesBreakdown: ExpensesBreakdown) {}

object CountryLevelDetail {
  implicit val format: OFormat[CountryLevelDetail] = Json.format[CountryLevelDetail]
}
