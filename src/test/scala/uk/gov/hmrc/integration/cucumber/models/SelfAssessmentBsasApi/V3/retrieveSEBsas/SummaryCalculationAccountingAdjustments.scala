/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationAccountingAdjustments(basisAdjustment: Option[BigDecimal],
                                                   overlapReliefUsed: Option[BigDecimal],
                                                   accountingAdjustment: Option[BigDecimal],
                                                   averagingAdjustment: Option[BigDecimal])

object SummaryCalculationAccountingAdjustments {
  implicit val format: OFormat[SummaryCalculationAccountingAdjustments] = Json.format[SummaryCalculationAccountingAdjustments]
}
