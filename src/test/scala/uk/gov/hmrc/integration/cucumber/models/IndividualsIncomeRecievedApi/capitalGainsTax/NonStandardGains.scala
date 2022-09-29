/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class NonStandardGains(carriedInterestGain: Option[BigDecimal],
                            carriedInterestRttTaxPaid: Option[BigDecimal],
                            attributedGains: Option[BigDecimal],
                            attributedGainsRttTaxPaid: Option[BigDecimal],
                            otherGains: Option[BigDecimal],
                            otherGainsRttTaxPaid: Option[BigDecimal])

object NonStandardGains {
  implicit val format: OFormat[NonStandardGains] = Json.format[NonStandardGains]
}
