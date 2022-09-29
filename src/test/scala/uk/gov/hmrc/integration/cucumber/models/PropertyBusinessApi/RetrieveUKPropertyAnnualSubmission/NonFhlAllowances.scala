/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class NonFhlAllowances(annualInvestmentAllowance: Option[BigDecimal],
                            businessPremisesRenovationAllowance: Option[BigDecimal],
                            otherCapitalAllowance: Option[BigDecimal],
                            costOfReplacingDomesticGoods: Option[BigDecimal],
                            propertyIncomeAllowance: Option[BigDecimal],
                            electricChargePointAllowance: Option[BigDecimal],
                            structuredBuildingAllowance: Option[Seq[StructuredBuildingAllowance]],
                            enhancedStructuredBuildingAllowance: Option[Seq[EnhancedStructuredBuildingAllowance]],
                            zeroEmissionsCarAllowance: Option[BigDecimal],
                            zeroEmissionsGoodsVehicleAllowance: Option[BigDecimal])

object NonFhlAllowances {
  implicit val format: OFormat[NonFhlAllowances] = Json.format[NonFhlAllowances]
}
