/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class PersonalInformationMandatory(identifier: String,
                                        dateOfBirth: String,
                                        taxRegime: String,
                                        statePensionAgeDate: String,
                                        studentLoanPlan: Seq[StudentLoanPlanMandatory],
                                        class2VoluntaryContributions: Boolean,
                                        marriageAllowance: String,
                                        uniqueTaxpayerReference: String)

object PersonalInformationMandatory {
  implicit val format: OFormat[PersonalInformationMandatory] = Json.format[PersonalInformationMandatory]
}