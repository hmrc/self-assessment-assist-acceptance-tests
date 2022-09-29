/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationDeductions(tradingAllowance: Option[BigDecimal],
                                        annualInvestmentAllowance: Option[BigDecimal],
                                        capitalAllowanceMainPool: Option[BigDecimal],
                                        capitalAllowanceSpecialRatePool: Option[BigDecimal],
                                        zeroEmissionGoods: Option[BigDecimal],
                                        businessPremisesRenovationAllowance: Option[BigDecimal],
                                        enhancedCapitalAllowance: Option[BigDecimal],
                                        allowanceOnSales: Option[BigDecimal],
                                        capitalAllowanceSingleAssetPool: Option[BigDecimal],
                                        includedNonTaxableProfits: Option[BigDecimal],
                                        electricChargePointAllowance: Option[BigDecimal],
                                        structuredBuildingAllowance: Option[BigDecimal],
                                        enhancedStructuredBuildingAllowance: Option[BigDecimal],
                                        zeroEmissionsCarAllowance: Option[BigDecimal])

object SummaryCalculationDeductions {
  implicit val format: OFormat[SummaryCalculationDeductions] = Json.format[SummaryCalculationDeductions]
}
