/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyAdjustments(privateUseAdjustment: Option[BigDecimal], balancingCharge: Option[BigDecimal])

object ForeignNonFhlPropertyAdjustments {
  implicit val format: OFormat[ForeignNonFhlPropertyAdjustments] = Json.format[ForeignNonFhlPropertyAdjustments]
}
