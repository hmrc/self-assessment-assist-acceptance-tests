/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.codedOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class PayeUnderpaymentsDetail(amount: BigDecimal,
                                   relatedTaxYear: String,
                                   source: Option[String])

object PayeUnderpaymentsDetail {
  implicit val format: OFormat[PayeUnderpaymentsDetail] = Json.format[PayeUnderpaymentsDetail]
}