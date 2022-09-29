/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class BusinessIncomeSources(incomeSourceId: String,
                                 incomeSourceType: String,
                                 incomeSourceName: Option[String],
                                 accountingPeriodStartDate: String,
                                 accountingPeriodEndDate: String,
                                 source: String,
                                 latestPeriodEndDate: String,
                                 latestReceivedDateTime: String,
                                 finalised: Option[Boolean],
                                 finalisationTimestamp: Option[String],
                                 submissionPeriods: Option[Seq[SubmissionPeriods]])

object BusinessIncomeSources {
 implicit val format: OFormat[BusinessIncomeSources] = Json.format[BusinessIncomeSources]
}