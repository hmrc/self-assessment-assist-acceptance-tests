/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyAllowances(annualInvestmentAllowance: Option[BigDecimal],
                                           costOfReplacingDomesticItems: Option[BigDecimal],
                                           zeroEmissionsGoodsVehicleAllowance: Option[BigDecimal],
                                           otherCapitalAllowance: Option[BigDecimal],
                                           electricChargePointAllowance: Option[BigDecimal],
                                           zeroEmissionsCarAllowance: Option[BigDecimal],
                                           propertyAllowance: Option[BigDecimal],
                                           structuredBuildingAllowance: Option[Seq[StructuredBuildingAllowance]])

object ForeignNonFhlPropertyAllowances {
  implicit val format: OFormat[ForeignNonFhlPropertyAllowances] = Json.format[ForeignNonFhlPropertyAllowances]
}
