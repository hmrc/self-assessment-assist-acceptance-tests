/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignNonFhlProperty

import play.api.libs.json.{Json, OFormat}

case class ForeignNonFhlPropertyIncome(rentIncome: Option[ForeignNonFhlPropertyRentIncome],
                                       foreignTaxCreditRelief: Boolean,
                                       premiumsOfLeaseGrant: Option[BigDecimal],
                                       otherPropertyIncome: Option[BigDecimal],
                                       foreignTaxPaidOrDeducted: Option[BigDecimal],
                                       specialWithholdingTaxOrUkTaxPaid: Option[BigDecimal])

object ForeignNonFhlPropertyIncome {
  implicit val format: OFormat[ForeignNonFhlPropertyIncome] = Json.format[ForeignNonFhlPropertyIncome]
}
