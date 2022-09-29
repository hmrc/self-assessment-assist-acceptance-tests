/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class FhlAllowances(annualInvestmentAllowance: Option[BigDecimal],
                         businessPremisesRenovationAllowance: Option[BigDecimal],
                         otherCapitalAllowance: Option[BigDecimal],
                         propertyIncomeAllowance: Option[BigDecimal],
                         electricChargePointAllowance: Option[BigDecimal],
                         zeroEmissionsCarAllowance: Option[BigDecimal])

object FhlAllowances {
  implicit val format: OFormat[FhlAllowances] = Json.format[FhlAllowances]
}
