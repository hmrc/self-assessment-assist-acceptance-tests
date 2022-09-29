/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyAllowances(annualInvestmentAllowance: BigDecimal,
                                     costOfReplacingDomesticItems: BigDecimal,
                                     zeroEmissionsGoodsVehicleAllowance: BigDecimal,
                                     propertyAllowance: BigDecimal,
                                     otherCapitalAllowance: BigDecimal,
                                     structureAndBuildingAllowance: BigDecimal,
                                     electricChargePointAllowance: BigDecimal)

object ForeignPropertyAllowances {
  implicit val format: OFormat[ForeignPropertyAllowances] = Json.format[ForeignPropertyAllowances]
}
