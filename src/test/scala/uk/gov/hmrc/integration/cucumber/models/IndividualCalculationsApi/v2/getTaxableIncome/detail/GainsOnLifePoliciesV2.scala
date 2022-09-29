/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class GainsOnLifePoliciesV2(incomeReceived: BigInt,
                                 taxableIncome: BigInt,
                                 totalUkGainsWithTaxPaid: Option[BigInt],
                                 totalForeignGainsOnLifePoliciesWithTaxPaid: Option[BigInt])

object GainsOnLifePoliciesV2 {
  implicit val formats: OFormat[GainsOnLifePoliciesV2] = Json.format[GainsOnLifePoliciesV2]
}
