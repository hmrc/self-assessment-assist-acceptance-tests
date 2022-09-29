/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyEntry(countryCode: String, adjustments: ForeignPropertyAdjustments, allowances: ForeignPropertyAllowances)

object ForeignPropertyEntry {
  implicit val format: OFormat[ForeignPropertyEntry] = Json.format[ForeignPropertyEntry]
}
