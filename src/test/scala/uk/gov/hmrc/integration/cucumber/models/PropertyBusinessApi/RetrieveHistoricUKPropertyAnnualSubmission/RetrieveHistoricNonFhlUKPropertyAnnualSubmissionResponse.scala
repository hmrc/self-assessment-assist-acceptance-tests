/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveHistoricUKPropertyAnnualSubmission

import play.api.libs.json.{Format, Json}

case class RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse(annualAdjustments: HistoricNonFhlUKPropertyAnnualAdjustments,
                                                                    annualAllowances: HistoricNonFhlUKPropertyAnnualAllowances)

object RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse {
  implicit val format: Format[RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse] = Json.format
}

case class HistoricNonFhlUKPropertyAnnualAdjustments(
                                                      lossBroughtForward: Option[BigDecimal],
                                                      privateUseAdjustment: Option[BigDecimal],
                                                      balancingCharge: Option[BigDecimal],
                                                      businessPremisesRenovationAllowanceBalancingCharges: Option[BigDecimal],
                                                      nonResidentLandlord: Boolean,
                                                      rentARoom: Option[HistoricRentARoom]
                                                    )

object HistoricNonFhlUKPropertyAnnualAdjustments {
  implicit val format: Format[HistoricNonFhlUKPropertyAnnualAdjustments] = Json.format
}

case class HistoricNonFhlUKPropertyAnnualAllowances(annualInvestmentAllowance: Option[BigDecimal],
                                                    zeroEmissionGoodsVehicleAllowance: Option[BigDecimal],
                                                    businessPremisesRenovationAllowance: Option[BigDecimal],
                                                    otherCapitalAllowance: Option[BigDecimal],
                                                    costOfReplacingDomesticGoods:Option[BigDecimal],
                                                    propertyIncomeAllowance: Option[BigDecimal])

object HistoricNonFhlUKPropertyAnnualAllowances {
  implicit val format: Format[HistoricNonFhlUKPropertyAnnualAllowances] = Json.format
}

