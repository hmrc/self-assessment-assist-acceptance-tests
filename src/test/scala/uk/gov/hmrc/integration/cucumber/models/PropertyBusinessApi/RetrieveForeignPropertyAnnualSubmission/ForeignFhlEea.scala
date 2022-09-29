/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEea(adjustments: ForeignFhlEeaAdjustments, allowances: ForeignFhlEeaAllowances)

object ForeignFhlEea {
  implicit val format: OFormat[ForeignFhlEea] = Json.format[ForeignFhlEea]
}
