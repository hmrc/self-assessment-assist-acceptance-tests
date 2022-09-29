/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyRfcDetailMandatory(countryCode: String,
                                             amountClaimed: BigInt,
                                             allowableAmount: BigDecimal,
                                             carryForwardAmount: BigDecimal)

object ForeignPropertyRfcDetailMandatory {
  implicit val format: OFormat[ForeignPropertyRfcDetailMandatory] = Json.format[ForeignPropertyRfcDetailMandatory]
}
