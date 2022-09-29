/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas.adjustableAdjustedSummaryCalculation

import play.api.libs.json.{Json, OFormat}

case class UkPropSummaryCalculationDeductions(zeroEmissionGoods: Option[BigDecimal],
                                              annualInvestmentAllowance: Option[BigDecimal],
                                              costOfReplacingDomesticItems: Option[BigDecimal],
                                              businessPremisesRenovationAllowance: Option[BigDecimal],
                                              propertyAllowance: Option[BigDecimal],
                                              otherCapitalAllowance: Option[BigDecimal],
                                              rarReliefClaimed: Option[BigDecimal],
                                              electricChargePointAllowance: Option[BigDecimal],
                                              structuredBuildingAllowance: Option[BigDecimal],
                                              enhancedStructuredBuildingAllowance: Option[BigDecimal],
                                              zeroEmissionsCarAllowance: Option[BigDecimal])

object UkPropSummaryCalculationDeductions {
  implicit val format: OFormat[UkPropSummaryCalculationDeductions] = Json.format[UkPropSummaryCalculationDeductions]
}
