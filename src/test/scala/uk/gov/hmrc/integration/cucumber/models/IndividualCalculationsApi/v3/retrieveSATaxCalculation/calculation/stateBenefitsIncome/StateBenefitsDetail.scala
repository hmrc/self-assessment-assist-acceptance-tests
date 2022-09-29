/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome.stateBenefitsDetail._

case class StateBenefitsDetail(incapacityBenefit: Option[Seq[IncapacityBenefit]],
                               statePension: Option[Seq[StatePension]],
                               statePensionLumpSum: Option[Seq[StatePensionLumpSum]],
                               employmentSupportAllowance: Option[Seq[EmploymentSupportAllowance]],
                               jobSeekersAllowance: Option[Seq[JobSeekersAllowance]],
                               bereavementAllowance: Option[Seq[BereavementAllowance]],
                               otherStateBenefits: Option[Seq[OtherStateBenefits]])

object StateBenefitsDetail {
  implicit val format: OFormat[StateBenefitsDetail] = Json.format[StateBenefitsDetail]
}