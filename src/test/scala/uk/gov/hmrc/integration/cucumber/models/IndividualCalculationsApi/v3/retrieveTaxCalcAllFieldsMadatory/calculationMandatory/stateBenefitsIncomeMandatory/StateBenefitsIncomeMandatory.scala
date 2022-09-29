/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class StateBenefitsIncomeMandatory(totalStateBenefitsIncome: BigDecimal,
                                        totalStateBenefitsTaxPaid: BigDecimal,
                                        totalStateBenefitsIncomeExcStatePensionLumpSum: BigDecimal,
                                        stateBenefitsDetail: StateBenefitsDetailMandatory)

object StateBenefitsIncomeMandatory {
  implicit val format: OFormat[StateBenefitsIncomeMandatory] = Json.format[StateBenefitsIncomeMandatory]
}