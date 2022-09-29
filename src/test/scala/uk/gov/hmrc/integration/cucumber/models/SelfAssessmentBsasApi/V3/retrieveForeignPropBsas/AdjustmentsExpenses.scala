/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsExpenses(premisesRunningCosts: Option[BigDecimal],
                               repairsAndMaintenance: Option[BigDecimal],
                               financialCosts: Option[BigDecimal],
                               professionalFees: Option[BigDecimal],
                               costOfServices: Option[BigDecimal],
                               travelCosts: Option[BigDecimal],
                               other: Option[BigDecimal],
                               consolidatedExpenses: Option[BigDecimal])

object AdjustmentsExpenses {
  implicit val format: OFormat[AdjustmentsExpenses] = Json.format[AdjustmentsExpenses]
}
