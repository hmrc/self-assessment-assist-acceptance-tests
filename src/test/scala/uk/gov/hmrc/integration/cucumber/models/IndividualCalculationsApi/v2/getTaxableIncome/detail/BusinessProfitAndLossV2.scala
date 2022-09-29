/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.eeaPropertyFhl.EeaPropertyFhlV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.foreignProperty.ForeignPropertyV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.selfEmployment.SelfEmploymentBusinessV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyFhl.UkPropertyFhlV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl.UkPropertyNonFhlV2

case class BusinessProfitAndLossV2(selfEmployments: Option[Seq[SelfEmploymentBusinessV2]],
                                   ukPropertyFhl: Option[UkPropertyFhlV2],
                                   ukPropertyNonFhl: Option[UkPropertyNonFhlV2],
                                   eeaPropertyFhl: Option[EeaPropertyFhlV2],
                                   foreignProperty: Option[ForeignPropertyV2])

object BusinessProfitAndLossV2 {
  implicit val formats: OFormat[BusinessProfitAndLossV2] = Json.format[BusinessProfitAndLossV2]
}
