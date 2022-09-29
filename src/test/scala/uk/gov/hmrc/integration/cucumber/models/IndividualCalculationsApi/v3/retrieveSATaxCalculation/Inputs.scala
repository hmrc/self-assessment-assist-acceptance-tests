/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs._


case class Inputs(personalInformation: PersonalInformation,
                  incomeSources: IncomeSources,
                  annualAdjustments: Option[Seq[AnnualAdjustments]],
                  lossesBroughtForward: Option[Seq[LossesBroughtForward]],
                  claims: Option[Seq[Claims]],
                  constructionIndustryScheme: Option[Seq[ConstructionIndustryScheme]],
                  allowancesReliefsAndDeductions: Option[Seq[AllowancesReliefsAndDeductions]],
                  pensionContributionAndCharges: Option[Seq[PensionContributionAndCharges]],
                  other: Option[Seq[Other]])

object Inputs {
  implicit val format: OFormat[Inputs] = Json.format[Inputs]
}