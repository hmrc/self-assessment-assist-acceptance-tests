/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class EnhancedStructuredBuildingAllowance(amount: BigDecimal, firstYear: Option[FirstYear], building: Option[Building])

object EnhancedStructuredBuildingAllowance {
  implicit val format: OFormat[EnhancedStructuredBuildingAllowance] = Json.format[EnhancedStructuredBuildingAllowance]
}
