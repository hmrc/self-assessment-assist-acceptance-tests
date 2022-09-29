/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class SubmissionPeriodsMandatory(periodId: String,
                                      startDate: String,
                                      endDate: String,
                                      receivedDateTime: String)

object SubmissionPeriodsMandatory {
  implicit val format: OFormat[SubmissionPeriodsMandatory] = Json.format[SubmissionPeriodsMandatory]
}