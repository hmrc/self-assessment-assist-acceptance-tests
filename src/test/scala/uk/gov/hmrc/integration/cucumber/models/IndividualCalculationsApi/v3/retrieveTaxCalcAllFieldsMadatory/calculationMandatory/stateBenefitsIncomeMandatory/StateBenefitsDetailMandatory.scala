/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory._

case class StateBenefitsDetailMandatory(incapacityBenefit: Seq[IncapacityBenefitMandatory],
                                        statePension: Seq[StatePensionMandatory],
                                        statePensionLumpSum: Seq[StatePensionLumpSumMandatory],
                                        employmentSupportAllowance: Seq[EmploymentSupportAllowanceMandatory],
                                        jobSeekersAllowance: Seq[JobSeekersAllowanceMandatory],
                                        bereavementAllowance: Seq[BereavementAllowanceMandatory],
                                        otherStateBenefits: Seq[OtherStateBenefitsMandatory])

object StateBenefitsDetailMandatory {
  implicit val format: OFormat[StateBenefitsDetailMandatory] = Json.format[StateBenefitsDetailMandatory]
}