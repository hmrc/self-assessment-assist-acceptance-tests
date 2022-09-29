/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.eeaPropertyFhl.EeaPropertyFhlV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.foreignProperty.ForeignPropertyV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment.SelfEmploymentBusinessV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyFhl.UkPropertyFhlV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.UkPropertyNonFhlV2

case class BusinessProfitAndLossV2(selfEmployments: Seq[SelfEmploymentBusinessV2],
                                   ukPropertyFhl: UkPropertyFhlV2,
                                   ukPropertyNonFhl: UkPropertyNonFhlV2,
                                   eeaPropertyFhl: EeaPropertyFhlV2,
                                   foreignProperty: ForeignPropertyV2)

object BusinessProfitAndLossV2 {
  implicit val format: OFormat[BusinessProfitAndLossV2] = Json.format[BusinessProfitAndLossV2]
}
