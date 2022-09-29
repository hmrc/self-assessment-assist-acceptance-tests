/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationDeductions(annualInvestmentAllowance: Option[BigDecimal],
                                        costOfReplacingDomesticItems: Option[BigDecimal],
                                        zeroEmissionGoods: Option[BigDecimal],
                                        propertyAllowance: Option[BigDecimal],
                                        otherCapitalAllowance: Option[BigDecimal],
                                        electricChargePointAllowance: Option[BigDecimal],
                                        structuredBuildingAllowance: Option[BigDecimal],
                                        zeroEmissionsCarAllowance: Option[BigDecimal])

object SummaryCalculationDeductions {
  implicit val format: OFormat[SummaryCalculationDeductions] = Json.format[SummaryCalculationDeductions]
}
