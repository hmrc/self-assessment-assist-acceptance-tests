/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class StructuredBuildingAllowance(amount: BigDecimal, firstYear: Option[FirstYear], building: Option[Building])

object StructuredBuildingAllowance {
  implicit val format: OFormat[StructuredBuildingAllowance] = Json.format[StructuredBuildingAllowance]
}
