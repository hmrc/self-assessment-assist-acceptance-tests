/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.incomeSummaryTotalsMandatory

import play.api.libs.json.{Json, OFormat}

case class IncomeSummaryTotalsMandatory(totalSelfEmploymentProfit: BigInt,
                                        totalPropertyProfit: BigInt,
                                        totalFHLPropertyProfit: BigInt,
                                        totalUKOtherPropertyProfit: BigInt,
                                        totalForeignPropertyProfit: BigInt,
                                        totalEeaFhlProfit: BigInt,
                                        totalEmploymentIncome: BigInt)

object IncomeSummaryTotalsMandatory {
  implicit val format: OFormat[IncomeSummaryTotalsMandatory] = Json.format[IncomeSummaryTotalsMandatory]
}