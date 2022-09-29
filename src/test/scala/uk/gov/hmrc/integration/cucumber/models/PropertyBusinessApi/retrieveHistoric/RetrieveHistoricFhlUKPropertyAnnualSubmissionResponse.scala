/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveHistoric

import play.api.libs.json.{Format, Json}

case class HistoricFhlUKPropertyAnnualAdjustments(
    lossBroughtForward: BigDecimal,
    privateUseAdjustment: BigDecimal,
    balancingCharge: BigDecimal,
    periodOfGraceAdjustment: Boolean,
    businessPremisesRenovationAllowanceBalancingCharges: BigDecimal,
    nonResidentLandlord: Boolean,
    rentARoom: HistoricRentARoom
)

object HistoricFhlUKPropertyAnnualAdjustments {
  implicit val format: Format[HistoricFhlUKPropertyAnnualAdjustments] = Json.format
}

case class HistoricFhlUKPropertyAnnualAllowances(annualInvestmentAllowance: BigDecimal,
                                                 businessPremisesRenovationAllowance: BigDecimal,
                                                 otherCapitalAllowance: BigDecimal,
                                                 propertyIncomeAllowance: BigDecimal)

object HistoricFhlUKPropertyAnnualAllowances {
  implicit val format: Format[HistoricFhlUKPropertyAnnualAllowances] = Json.format
}

case class RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse(annualAdjustments: HistoricFhlUKPropertyAnnualAdjustments,
                                                                 annualAllowances: HistoricFhlUKPropertyAnnualAllowances)

object RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse {
  implicit val format: Format[RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse] = Json.format
}
