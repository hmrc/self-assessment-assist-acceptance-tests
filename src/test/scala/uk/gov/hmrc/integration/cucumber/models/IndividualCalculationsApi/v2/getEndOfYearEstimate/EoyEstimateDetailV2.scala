/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getEndOfYearEstimate.detail._

case class EoyEstimateDetailV2(selfEmployments: Option[Seq[EoyEstimateSelfEmploymentsV2]],
                               ukPropertyFhl: Option[EoyEstimateUkPropertyFhlV2],
                               ukPropertyNonFhl: Option[EoyEstimateUkPropertyNonFhlV2],
                               ukSavings: Option[Seq[EoyEstimateUkSavingsV2]],
                               ukDividends: Option[EoyEstimateUkDividendsV2],
                               otherDividends: Option[EoyEstimateOtherDividendsV2],
                               foreignCompanyDividends: Option[EoyEstimateForeignCompanyDividendsV2],
                               stateBenefits: Option[EoyEstimateStateBenefitsV2],
                               ukSecurities: Option[EoyEstimateUkSecuritiesV2],
                               foreignProperty: Option[EoyEstimateForeignPropertyV2],
                               eeaPropertyFhl: Option[EoyEstimateEeaPropertyFhlV2],
                               foreignInterest: Option[EoyEstimateForeignInterestV2],
                               otherIncome: Option[EoyEstimateOtherIncomeV2],
                               foreignPension: Option[EoyEstimateForeignPensionV2])

object EoyEstimateDetailV2 {
  implicit val formats: OFormat[EoyEstimateDetailV2] = Json.format[EoyEstimateDetailV2]
}
