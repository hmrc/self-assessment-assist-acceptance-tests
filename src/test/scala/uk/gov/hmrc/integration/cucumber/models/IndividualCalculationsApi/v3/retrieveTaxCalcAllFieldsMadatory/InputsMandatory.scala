/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory._

case class InputsMandatory(personalInformation: PersonalInformationMandatory,
                           incomeSources: IncomeSourcesMandatory,
                           annualAdjustments: Seq[AnnualAdjustmentsMandatory],
                           lossesBroughtForward: Seq[LossesBroughtForwardMandatory],
                           claims: Seq[ClaimsMandatory],
                           constructionIndustryScheme: Seq[ConstructionIndustrySchemeMandatory],
                           allowancesReliefsAndDeductions: Seq[AllowancesReliefsAndDeductionsMandatory],
                           pensionContributionAndCharges: Seq[PensionContributionAndChargesMandatory],
                           other: Seq[OtherMandatory])

object InputsMandatory {
  implicit val format: OFormat[InputsMandatory] =Json.format[InputsMandatory]
}