/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}

case class NonFhlIncome(
    premiumsOfLeaseGrant: Option[BigDecimal],
    reversePremiums: Option[BigDecimal],
    periodAmount: Option[BigDecimal],
    taxDeducted: Option[BigDecimal],
    otherIncome: Option[BigDecimal],
    rentARoom: Option[NonFhlIncomeRentARoom]
)

object NonFhlIncome {
  implicit val format: OFormat[NonFhlIncome] = Json.format[NonFhlIncome]
}
