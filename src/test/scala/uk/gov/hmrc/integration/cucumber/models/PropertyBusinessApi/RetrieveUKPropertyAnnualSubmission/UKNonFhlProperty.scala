/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class UKNonFhlProperty(adjustments: Option[NonFhlAdjustments], allowances: Option[NonFhlAllowances])

object UKNonFhlProperty {
  implicit val format: OFormat[UKNonFhlProperty] = Json.format[UKNonFhlProperty]
}
