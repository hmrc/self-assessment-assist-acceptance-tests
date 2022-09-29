/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class GainsOnLifePoliciesV2(incomeReceived: BigInt,
                                 taxableIncome: BigInt,
                                 totalUkGainsWithTaxPaid: BigInt,
                                 totalForeignGainsOnLifePoliciesWithTaxPaid: BigInt)

object GainsOnLifePoliciesV2 {
  implicit val format: OFormat[GainsOnLifePoliciesV2] = Json.format[GainsOnLifePoliciesV2]
}
