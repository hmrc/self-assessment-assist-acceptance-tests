/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsIncome(totalRentsReceived: Option[BigDecimal])

object AdjustmentsIncome {
  implicit val format: OFormat[AdjustmentsIncome] = Json.format[AdjustmentsIncome]
}
