/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.chargeableEventGainsIncome

import play.api.libs.json.{Json, OFormat}

case class ForeignGainsOnLifePoliciesTaxPaidDetail(customerReference: Option[String],
                                                   gainAmount: Option[BigDecimal],
                                                   taxPaidAmount: Option[BigDecimal],
                                                   yearsHeld: Option[BigInt])

object ForeignGainsOnLifePoliciesTaxPaidDetail {
  implicit val format: OFormat[ForeignGainsOnLifePoliciesTaxPaidDetail] = Json.format[ForeignGainsOnLifePoliciesTaxPaidDetail]
}