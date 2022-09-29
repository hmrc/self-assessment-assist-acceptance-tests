/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts._

case class ResidentialFinanceCosts(adjustedTotalIncome: BigDecimal,
                                   totalAllowableAmount: Option[BigDecimal],
                                   relievableAmount: BigDecimal,
                                   rate: BigDecimal,
                                   totalResidentialFinanceCostsRelief: BigDecimal,
                                   ukProperty: Option[UkProperty],
                                   foreignProperty: Option[ForeignProperty],
                                   allOtherIncomeReceivedWhilstAbroad: Option[AllOtherIncomeReceivedWhilstAbroad])

object ResidentialFinanceCosts {
  implicit val format: OFormat[ResidentialFinanceCosts] = Json.format[ResidentialFinanceCosts]
}