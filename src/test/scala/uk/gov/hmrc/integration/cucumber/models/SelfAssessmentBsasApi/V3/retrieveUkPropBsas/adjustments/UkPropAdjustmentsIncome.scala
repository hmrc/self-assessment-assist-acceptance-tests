/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustments

import play.api.libs.json.{Json, OFormat}

case class UkPropAdjustmentsIncome(totalRentsReceived: Option[BigDecimal],
                                   premiumsOfLeaseGrant: Option[BigDecimal],
                                   reversePremiums: Option[BigDecimal],
                                   otherPropertyIncome: Option[BigDecimal])

object UkPropAdjustmentsIncome {
  implicit val format: OFormat[UkPropAdjustmentsIncome] = Json.format[UkPropAdjustmentsIncome]
}
