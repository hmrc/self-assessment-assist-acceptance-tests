/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class UKFhlProperty(adjustments: Option[FhlAdjustments], allowances: Option[FhlAllowances])

object UKFhlProperty {
  implicit val format: OFormat[UKFhlProperty] = Json.format[UKFhlProperty]
}
