/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.bsas

import play.api.libs.json.{Json, OFormat}

case class Bsas(total: Total,
                profit: Option[Profit],
                loss: Option[Loss],
                incomeBreakdown: Option[IncomeBreakdown],
                expensesBreakdown: Option[ExpensesBreakdown],
                countryLevel: Option[Seq[CountryLevelDetail]])

object Bsas {
  implicit val format: OFormat[Bsas] = Json.format[Bsas]
}
