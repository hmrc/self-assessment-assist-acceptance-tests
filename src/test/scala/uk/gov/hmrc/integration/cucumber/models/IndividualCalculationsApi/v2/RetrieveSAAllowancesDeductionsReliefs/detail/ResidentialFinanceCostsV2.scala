/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail.residentialFinanceCosts._

case class ResidentialFinanceCostsV2(adjustedTotalIncome: BigDecimal,
                                     totalAllowableAmount: Option[BigDecimal],
                                     relievableAmount: BigDecimal,
                                     rate: BigDecimal,
                                     totalResidentialFinanceCostsRelief: BigDecimal,
                                     ukProperty: Option[UkPropertyV2],
                                     foreignProperty: Option[ForeignPropertyV2],
                                     allOtherIncomeReceivedWhilstAbroad: Option[AllOtherIncomeReceivedWhilstAbroadV2])

object ResidentialFinanceCostsV2 {
  implicit val format: OFormat[ResidentialFinanceCostsV2] = Json.format[ResidentialFinanceCostsV2]
}
