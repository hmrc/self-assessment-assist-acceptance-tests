/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.stateBenefitsIncome

import play.api.libs.json.{Json, OFormat}

case class StateBenefitsIncome(totalStateBenefitsIncome: Option[BigDecimal],
                               totalStateBenefitsTaxPaid: Option[BigDecimal],
                               totalStateBenefitsIncomeExcStatePensionLumpSum: Option[BigDecimal],
                               stateBenefitsDetail: Option[StateBenefitsDetail])

object StateBenefitsIncome {
  implicit val format: OFormat[StateBenefitsIncome] = Json.format[StateBenefitsIncome]
}