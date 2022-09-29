/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class BusinessIncomeSourcesMandatory(incomeSourceId: String,
                                          incomeSourceType: String,
                                          incomeSourceName: String,
                                          accountingPeriodStartDate: String,
                                          accountingPeriodEndDate: String,
                                          source: String,
                                          latestPeriodEndDate: String,
                                          latestReceivedDateTime: String,
                                          finalised: Boolean,
                                          finalisationTimestamp: String,
                                          submissionPeriods: Seq[SubmissionPeriodsMandatory])

object BusinessIncomeSourcesMandatory {
 implicit val format: OFormat[BusinessIncomeSourcesMandatory] = Json.format[BusinessIncomeSourcesMandatory]
}