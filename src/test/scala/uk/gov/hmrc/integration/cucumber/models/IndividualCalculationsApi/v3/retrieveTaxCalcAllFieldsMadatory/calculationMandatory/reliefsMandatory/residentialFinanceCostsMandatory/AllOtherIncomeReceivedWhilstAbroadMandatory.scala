/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory

import play.api.libs.json.{Json, OFormat}

case class AllOtherIncomeReceivedWhilstAbroadMandatory(totalOtherIncomeAllowableAmount: BigDecimal,
                                                       otherIncomeRfcDetail: Seq[OtherIncomeRfcDetailMandatory])

object AllOtherIncomeReceivedWhilstAbroadMandatory {
  implicit val format: OFormat[AllOtherIncomeReceivedWhilstAbroadMandatory] = Json.format[AllOtherIncomeReceivedWhilstAbroadMandatory]
}
