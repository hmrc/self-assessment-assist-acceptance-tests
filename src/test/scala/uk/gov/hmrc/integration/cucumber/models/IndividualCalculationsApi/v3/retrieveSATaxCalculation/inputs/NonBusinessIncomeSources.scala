/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class NonBusinessIncomeSources(incomeSourceId: Option[String],
                                    incomeSourceType: String,
                                    incomeSourceName: Option[String],
                                    startDate: String,
                                    endDate: Option[String],
                                    source: String,
                                    periodId: Option[String],
                                    latestReceivedDateTime: Option[String])

object NonBusinessIncomeSources {
  implicit val format: OFormat[NonBusinessIncomeSources] = Json.format[NonBusinessIncomeSources]
}