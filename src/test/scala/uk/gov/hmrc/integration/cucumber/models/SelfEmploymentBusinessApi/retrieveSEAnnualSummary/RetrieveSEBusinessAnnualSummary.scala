/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary

import play.api.libs.json.{Json, OFormat}

case class RetrieveSEBusinessAnnualSummary(adjustments: Option[Adjustments], allowances: Option[Allowances], nonFinancials: Option[NonFinancials])

object RetrieveSEBusinessAnnualSummary {
  implicit val format: OFormat[RetrieveSEBusinessAnnualSummary] = Json.format[RetrieveSEBusinessAnnualSummary]
}
