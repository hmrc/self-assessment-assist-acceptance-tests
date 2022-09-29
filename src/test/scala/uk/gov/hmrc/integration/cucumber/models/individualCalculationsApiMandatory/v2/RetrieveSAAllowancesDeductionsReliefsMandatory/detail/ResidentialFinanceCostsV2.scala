/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.residentialFinanceCosts._

case class ResidentialFinanceCostsV2(adjustedTotalIncome: BigDecimal,
                                     totalAllowableAmount: BigDecimal,
                                     relievableAmount: BigDecimal,
                                     rate: BigDecimal,
                                     totalResidentialFinanceCostsRelief: BigDecimal,
                                     ukProperty: UkPropertyV2,
                                     foreignProperty: ForeignPropertyV2,
                                     allOtherIncomeReceivedWhilstAbroad: AllOtherIncomeReceivedWhilstAbroadV2)

object ResidentialFinanceCostsV2 {
  implicit val format: OFormat[ResidentialFinanceCostsV2] = Json.format[ResidentialFinanceCostsV2]
}
