/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation

import play.api.libs.json.{Json, OFormat}

case class UkPropSummaryCalculationIncome(totalRentsReceived: Option[BigDecimal],
                                          premiumsOfLeaseGrant: Option[BigDecimal],
                                          reversePremiums: Option[BigDecimal],
                                          otherPropertyIncome: Option[BigDecimal],
                                          rarRentReceived: Option[BigDecimal])

object UkPropSummaryCalculationIncome {
  implicit val format: OFormat[UkPropSummaryCalculationIncome] = Json.format[UkPropSummaryCalculationIncome]
}
