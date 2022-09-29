/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary

import play.api.libs.json.{Json, OFormat}

case class Allowances(annualInvestmentAllowance: Option[BigDecimal],
                      businessPremisesRenovationAllowance: Option[BigDecimal],
                      capitalAllowanceMainPool: Option[BigDecimal],
                      capitalAllowanceSpecialRatePool: Option[BigDecimal],
                      zeroEmissionsGoodsVehicleAllowance: Option[BigDecimal],
                      enhancedCapitalAllowance: Option[BigDecimal],
                      allowanceOnSales: Option[BigDecimal],
                      capitalAllowanceSingleAssetPool: Option[BigDecimal],
                      tradingIncomeAllowance: Option[BigDecimal],
                      electricChargePointAllowance: Option[BigDecimal],
                      zeroEmissionsCarAllowance: Option[BigDecimal],
                      structuredBuildingAllowance: Option[Seq[StructuredBuildingAllowance]],
                      enhancedStructuredBuildingAllowance: Option[Seq[StructuredBuildingAllowance]])

object Allowances {
  implicit val format: OFormat[Allowances] = Json.format[Allowances]
}
