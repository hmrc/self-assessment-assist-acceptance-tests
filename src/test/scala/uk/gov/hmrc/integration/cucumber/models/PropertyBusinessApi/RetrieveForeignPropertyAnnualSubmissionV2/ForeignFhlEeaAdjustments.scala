/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaAdjustments(privateUseAdjustment: Option[BigDecimal],
                                    balancingCharge: Option[BigDecimal],
                                    periodOfGraceAdjustment: Option[Boolean])

object ForeignFhlEeaAdjustments {
  implicit val format: OFormat[ForeignFhlEeaAdjustments] = Json.format[ForeignFhlEeaAdjustments]
}
