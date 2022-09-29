/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class FhlAdjustments(privateUseAdjustment: Option[BigDecimal],
                          balancingCharge: Option[BigDecimal],
                          periodOfGraceAdjustment: Boolean,
                          businessPremisesRenovationAllowanceBalancingCharges: Option[BigDecimal],
                          nonResidentLandlord: Boolean,
                          rentARoom: Option[RentARoom])

object FhlAdjustments {
  implicit val format: OFormat[FhlAdjustments] = Json.format[FhlAdjustments]
}
