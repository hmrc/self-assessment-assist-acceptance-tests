/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationIncome(totalRentsReceived: Option[BigDecimal],
                                    premiumsOfLeaseGrant: Option[BigDecimal],
                                    otherPropertyIncome: Option[BigDecimal])

object SummaryCalculationIncome {
  implicit val format: OFormat[SummaryCalculationIncome] = Json.format[SummaryCalculationIncome]
}
