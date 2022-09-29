/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyEntry(countryCode: String,
                                      adjustments: Option[ForeignNonFhlPropertyAdjustments],
                                      allowances: Option[ForeignNonFhlPropertyAllowances])

object ForeignNonFhlPropertyEntry {
  implicit val format: OFormat[ForeignNonFhlPropertyEntry] = Json.format[ForeignNonFhlPropertyEntry]
}
