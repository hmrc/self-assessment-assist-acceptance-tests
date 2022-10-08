/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Enums.{Source, TypeOfBusiness}

case class Inputs(typeOfBusiness: TypeOfBusiness,
                  businessId: String,
                  businessName: Option[String],
                  accountingPeriodStartDate: String,
                  accountingPeriodEndDate: String,
                  source: Source,
                  submissionPeriods: Seq[SubmissionPeriods])

object Inputs {
  implicit val format: OFormat[Inputs] = Json.format[Inputs]
}