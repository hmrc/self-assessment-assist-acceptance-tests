/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail._

case class EoyEstimateDetailV2(selfEmployments: Seq[EoyEstimateSelfEmploymentsV2],
                               ukPropertyFhl: EoyEstimateUkPropertyFhlV2,
                               ukPropertyNonFhl: EoyEstimateUkPropertyNonFhlV2,
                               ukSavings: Seq[EoyEstimateUkSavingsV2],
                               ukDividends: EoyEstimateUkDividendsV2,
                               otherDividends: EoyEstimateOtherDividendsV2,
                               foreignCompanyDividends: EoyEstimateForeignCompanyDividendsV2,
                               stateBenefits: EoyEstimateStateBenefitsV2,
                               ukSecurities: EoyEstimateUkSecuritiesV2,
                               foreignProperty: EoyEstimateForeignPropertyV2,
                               eeaPropertyFhl: EoyEstimateEeaPropertyFhlV2,
                               foreignInterest: EoyEstimateForeignInterestV2,
                               otherIncome: EoyEstimateOtherIncomeV2,
                               foreignPension: EoyEstimateForeignPensionV2)

object EoyEstimateDetailV2 {
  implicit val formats: OFormat[EoyEstimateDetailV2] = Json.format[EoyEstimateDetailV2]
}
