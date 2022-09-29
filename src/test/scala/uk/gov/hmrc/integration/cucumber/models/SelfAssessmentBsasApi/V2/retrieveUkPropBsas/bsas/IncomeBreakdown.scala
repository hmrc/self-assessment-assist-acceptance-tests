/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsas.v2.bsas

import play.api.libs.json.{Json, OFormat}

case class IncomeBreakdown(rentIncome: Option[BigDecimal],
                           premiumsOfLeaseGrant: Option[BigDecimal],
                           reversePremiums: Option[BigDecimal],
                           otherPropertyIncome: Option[BigDecimal],
                           rarRentReceived: Option[BigDecimal])

object IncomeBreakdown {
  implicit val format: OFormat[IncomeBreakdown] = Json.format[IncomeBreakdown]
}
