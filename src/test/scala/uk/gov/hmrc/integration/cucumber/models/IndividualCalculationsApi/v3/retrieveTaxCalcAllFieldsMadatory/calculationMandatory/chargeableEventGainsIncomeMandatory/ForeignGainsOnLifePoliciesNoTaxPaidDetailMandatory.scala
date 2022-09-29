/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignGainsOnLifePoliciesNoTaxPaidDetailMandatory(customerReference: String,
                                                              gainAmount: BigDecimal,
                                                              yearsHeld: BigInt)

object ForeignGainsOnLifePoliciesNoTaxPaidDetailMandatory {
  implicit val format: OFormat[ForeignGainsOnLifePoliciesNoTaxPaidDetailMandatory] = Json.format[ForeignGainsOnLifePoliciesNoTaxPaidDetailMandatory]
}