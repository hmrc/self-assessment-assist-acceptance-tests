/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class AllowancesReliefsAndDeductions(`type`: Option[String],
                                          submittedTimestamp: Option[String],
                                          startDate: Option[String],
                                          endDate: Option[String],
                                          source: Option[String])

object AllowancesReliefsAndDeductions {
  implicit val format: OFormat[AllowancesReliefsAndDeductions] = Json.format[AllowancesReliefsAndDeductions]
}