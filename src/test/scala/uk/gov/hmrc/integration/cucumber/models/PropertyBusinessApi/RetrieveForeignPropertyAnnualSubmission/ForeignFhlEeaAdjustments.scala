/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaAdjustments(privateUseAdjustment: BigDecimal, balancingCharge: BigDecimal, periodOfGraceAdjustment: Boolean)

object ForeignFhlEeaAdjustments {
  implicit val format: OFormat[ForeignFhlEeaAdjustments] = Json.format[ForeignFhlEeaAdjustments]
}
