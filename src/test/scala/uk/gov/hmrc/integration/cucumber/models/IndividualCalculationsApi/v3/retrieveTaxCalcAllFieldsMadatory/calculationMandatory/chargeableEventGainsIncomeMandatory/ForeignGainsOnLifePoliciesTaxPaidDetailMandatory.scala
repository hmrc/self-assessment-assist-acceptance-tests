/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignGainsOnLifePoliciesTaxPaidDetailMandatory(customerReference: String,
                                                            gainAmount: BigDecimal,
                                                            taxPaidAmount: BigDecimal,
                                                            yearsHeld: BigInt)

object ForeignGainsOnLifePoliciesTaxPaidDetailMandatory {
  implicit val format: OFormat[ForeignGainsOnLifePoliciesTaxPaidDetailMandatory] = Json.format[ForeignGainsOnLifePoliciesTaxPaidDetailMandatory]
}