/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsasAdjustments

import play.api.libs.json.{Json, OFormat}

case class BsasDetail(income: Option[IncomeBreakdown], expenses: Option[ExpensesBreakdown], additions: Option[AdditionsBreakdown])

object BsasDetail {
  implicit val format: OFormat[BsasDetail] = Json.format[BsasDetail]
}
