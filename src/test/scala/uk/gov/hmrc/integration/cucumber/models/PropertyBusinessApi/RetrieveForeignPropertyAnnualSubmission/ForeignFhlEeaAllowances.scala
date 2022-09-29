/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class ForeignFhlEeaAllowances(annualInvestmentAllowance: BigDecimal,
                                   otherCapitalAllowance: BigDecimal,
                                   propertyAllowance: BigDecimal,
                                   electricChargePointAllowance: BigDecimal)

object ForeignFhlEeaAllowances {
  implicit val format: OFormat[ForeignFhlEeaAllowances] = Json.format[ForeignFhlEeaAllowances]
}
