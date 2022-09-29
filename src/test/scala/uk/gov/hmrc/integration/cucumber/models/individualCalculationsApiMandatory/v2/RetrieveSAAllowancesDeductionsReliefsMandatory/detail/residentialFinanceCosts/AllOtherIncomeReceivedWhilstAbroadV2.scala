/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class AllOtherIncomeReceivedWhilstAbroadV2(totalOtherIncomeAllowableAmount: BigDecimal, otherIncomeRfcDetail: Seq[OtherIncomeRfcDetailV2])

object AllOtherIncomeReceivedWhilstAbroadV2 {
  implicit val format: OFormat[AllOtherIncomeReceivedWhilstAbroadV2] = Json.format[AllOtherIncomeReceivedWhilstAbroadV2]
}
