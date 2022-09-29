/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationAdditions(privateUseAdjustment: Option[BigDecimal], balancingCharge: Option[BigDecimal])

object SummaryCalculationAdditions {
  implicit val format: OFormat[SummaryCalculationAdditions] = Json.format[SummaryCalculationAdditions]
}
