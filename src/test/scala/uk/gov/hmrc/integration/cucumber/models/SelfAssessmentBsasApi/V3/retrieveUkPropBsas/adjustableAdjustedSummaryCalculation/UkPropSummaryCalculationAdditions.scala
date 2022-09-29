/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation

import play.api.libs.json.{Json, OFormat}

case class UkPropSummaryCalculationAdditions(privateUseAdjustment: Option[BigDecimal],
                                             balancingCharge: Option[BigDecimal],
                                             bpraBalancingCharge: Option[BigDecimal])

object UkPropSummaryCalculationAdditions {
  implicit val format: OFormat[UkPropSummaryCalculationAdditions] = Json.format[UkPropSummaryCalculationAdditions]
}
