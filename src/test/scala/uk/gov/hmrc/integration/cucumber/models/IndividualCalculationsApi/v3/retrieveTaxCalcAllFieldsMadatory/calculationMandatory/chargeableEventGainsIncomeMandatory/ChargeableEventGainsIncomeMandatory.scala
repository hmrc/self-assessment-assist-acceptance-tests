/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.chargeableEventGainsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ChargeableEventGainsIncomeMandatory(totalOfAllGains: BigInt,
                                               totalGainsWithTaxPaid: BigInt,
                                               gainsWithTaxPaidDetail: Seq[GainsWithTaxPaidDetailMandatory],
                                               totalGainsWithNoTaxPaidAndVoidedIsa: BigInt,
                                               gainsWithNoTaxPaidAndVoidedIsaDetail: Seq[GainsWithNoTaxPaidAndVoidedIsaDetailMandatory],
                                               totalForeignGainsOnLifePoliciesTaxPaid: BigInt,
                                               foreignGainsOnLifePoliciesTaxPaidDetail: Seq[ForeignGainsOnLifePoliciesTaxPaidDetailMandatory],
                                               totalForeignGainsOnLifePoliciesNoTaxPaid: BigInt,
                                               foreignGainsOnLifePoliciesNoTaxPaidDetail: Seq[ForeignGainsOnLifePoliciesNoTaxPaidDetailMandatory])

object ChargeableEventGainsIncomeMandatory {
  implicit val format: OFormat[ChargeableEventGainsIncomeMandatory] = Json.format[ChargeableEventGainsIncomeMandatory]
}