/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class PersonalInformation(identifier: String,
                               dateOfBirth: Option[String],
                               taxRegime: String,
                               statePensionAgeDate: Option[String],
                               studentLoanPlan: Option[Seq[StudentLoanPlan]],
                               class2VoluntaryContributions: Option[Boolean],
                               marriageAllowance: Option[String],
                               uniqueTaxpayerReference: Option[String])

object PersonalInformation {
  implicit val format: OFormat[PersonalInformation] = Json.format[PersonalInformation]
}