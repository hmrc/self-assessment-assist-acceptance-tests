/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaAllowances(annualInvestmentAllowance: Option[BigDecimal],
                                   otherCapitalAllowance: Option[BigDecimal],
                                   electricChargePointAllowance: Option[BigDecimal],
                                   zeroEmissionsCarAllowance: Option[BigDecimal],
                                   propertyAllowance: Option[BigDecimal])

object ForeignFhlEeaAllowances {
  implicit val format: OFormat[ForeignFhlEeaAllowances] = Json.format[ForeignFhlEeaAllowances]
}
