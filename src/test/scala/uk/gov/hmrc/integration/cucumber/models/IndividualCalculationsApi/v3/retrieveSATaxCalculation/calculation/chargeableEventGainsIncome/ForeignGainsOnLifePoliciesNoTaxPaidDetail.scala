/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.chargeableEventGainsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignGainsOnLifePoliciesNoTaxPaidDetail(customerReference: Option[String],
                                                     gainAmount: Option[BigDecimal],
                                                     yearsHeld: Option[BigInt])

object ForeignGainsOnLifePoliciesNoTaxPaidDetail {
  implicit val format: OFormat[ForeignGainsOnLifePoliciesNoTaxPaidDetail] = Json.format[ForeignGainsOnLifePoliciesNoTaxPaidDetail]
}