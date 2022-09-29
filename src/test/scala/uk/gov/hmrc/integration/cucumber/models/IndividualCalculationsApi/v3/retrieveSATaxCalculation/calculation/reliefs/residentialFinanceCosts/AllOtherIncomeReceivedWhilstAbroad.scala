/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class AllOtherIncomeReceivedWhilstAbroad(totalOtherIncomeAllowableAmount: BigDecimal,
                                              otherIncomeRfcDetail: Seq[OtherIncomeRfcDetail])

object AllOtherIncomeReceivedWhilstAbroad {
  implicit val format: OFormat[AllOtherIncomeReceivedWhilstAbroad] = Json.format[AllOtherIncomeReceivedWhilstAbroad]
}
