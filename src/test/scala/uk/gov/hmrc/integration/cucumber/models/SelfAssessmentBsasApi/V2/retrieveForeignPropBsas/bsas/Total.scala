/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveForeignPropBsas.bsas

import play.api.libs.json.{Json, OFormat}

case class Total(income: Option[BigDecimal], expenses: Option[BigDecimal], additions: Option[BigDecimal], deductions: Option[BigDecimal])

object Total {
  implicit val format: OFormat[Total] = Json.format[Total]
}
