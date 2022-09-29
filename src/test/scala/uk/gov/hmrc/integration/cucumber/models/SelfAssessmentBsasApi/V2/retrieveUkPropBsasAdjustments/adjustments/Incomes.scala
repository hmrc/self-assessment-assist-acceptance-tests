/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.adjustments

import play.api.libs.json.{Json, OFormat}

case class Incomes(rentIncome: Option[BigDecimal],
                   premiumsOfLeaseGrant: Option[BigDecimal],
                   reversePremiums: Option[BigDecimal],
                   otherPropertyIncome: Option[BigDecimal])

object Incomes {
  implicit val format: OFormat[Incomes] = Json.format[Incomes]
}
