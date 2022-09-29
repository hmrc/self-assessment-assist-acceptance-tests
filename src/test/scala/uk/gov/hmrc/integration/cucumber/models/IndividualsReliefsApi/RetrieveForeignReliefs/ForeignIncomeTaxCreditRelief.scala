/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveForeignReliefs

import play.api.libs.json.{Json, OFormat}

case class ForeignIncomeTaxCreditRelief(countryCode: String,
                                        foreignTaxPaid: Option[BigDecimal],
                                        taxableAmount: BigDecimal,
                                        employmentLumpSum: Boolean)

object ForeignIncomeTaxCreditRelief {
  implicit val format: OFormat[ForeignIncomeTaxCreditRelief] = Json.format[ForeignIncomeTaxCreditRelief]
}
