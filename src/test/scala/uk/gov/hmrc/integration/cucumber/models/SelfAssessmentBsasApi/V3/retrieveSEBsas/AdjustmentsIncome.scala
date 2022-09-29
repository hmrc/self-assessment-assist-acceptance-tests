/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsIncome(turnover: Option[BigDecimal], other: Option[BigDecimal])

object AdjustmentsIncome {
  implicit val format: OFormat[AdjustmentsIncome] = Json.format[AdjustmentsIncome]
}
