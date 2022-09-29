/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBissApi.Common

import play.api.libs.json.{Json, OFormat}

case class Profit(net: Option[BigDecimal], taxable: Option[BigDecimal])

object Profit {
  implicit val format: OFormat[Profit] = Json.format[Profit]
}
