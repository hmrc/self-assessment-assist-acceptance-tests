/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory._

case class ResidentialFinanceCostsMandatory(adjustedTotalIncome: BigDecimal,
                                            totalAllowableAmount: BigDecimal,
                                            relievableAmount: BigDecimal,
                                            rate: BigDecimal,
                                            totalResidentialFinanceCostsRelief: BigDecimal,
                                            ukProperty: UkPropertyMandatory,
                                            foreignProperty: ForeignPropertyMandatory,
                                            allOtherIncomeReceivedWhilstAbroad: AllOtherIncomeReceivedWhilstAbroadMandatory)

object ResidentialFinanceCostsMandatory {
  implicit val format: OFormat[ResidentialFinanceCostsMandatory] = Json.format[ResidentialFinanceCostsMandatory]
}