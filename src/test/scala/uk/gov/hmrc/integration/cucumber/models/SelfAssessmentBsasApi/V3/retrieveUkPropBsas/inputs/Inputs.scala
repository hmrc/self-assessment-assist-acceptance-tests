/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.inputs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Enums.Source

case class Inputs(typeOfBusiness: String,
                  businessId: String,
                  businessName: Option[String],
                  accountingPeriodStartDate: String,
                  accountingPeriodEndDate: String,
                  source: Source,
                  submissionPeriods: Seq[SubmissionPeriod])

object Inputs {
  implicit val format: OFormat[Inputs] = Json.format[Inputs]
}
