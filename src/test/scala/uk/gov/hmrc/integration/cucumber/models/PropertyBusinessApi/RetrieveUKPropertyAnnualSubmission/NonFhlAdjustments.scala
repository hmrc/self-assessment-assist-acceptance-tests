/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class NonFhlAdjustments(privateUseAdjustment: Option[BigDecimal],
                             balancingCharge: Option[BigDecimal],
                             businessPremisesRenovationAllowanceBalancingCharges: Option[BigDecimal],
                             nonResidentLandlord: Boolean,
                             rentARoom: Option[RentARoom])

object NonFhlAdjustments {
  implicit val format: OFormat[NonFhlAdjustments] = Json.format[NonFhlAdjustments]
}
