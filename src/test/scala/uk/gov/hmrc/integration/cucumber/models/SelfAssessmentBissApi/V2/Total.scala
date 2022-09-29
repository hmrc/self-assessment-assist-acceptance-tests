/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBissApi.V2

import play.api.libs.json.{Json, OFormat}

case class Total(income: BigDecimal,
                 expenses: Option[BigDecimal],
                 additions: Option[BigDecimal],
                 deductions: Option[BigDecimal],
                 accountingAdjustments: Option[BigDecimal])

object Total {
  implicit val format: OFormat[Total] = Json.format[Total]
}
