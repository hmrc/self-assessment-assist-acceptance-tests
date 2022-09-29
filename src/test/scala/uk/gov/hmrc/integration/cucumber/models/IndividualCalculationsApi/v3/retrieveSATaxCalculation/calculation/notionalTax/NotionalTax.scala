/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.notionalTax

import play.api.libs.json.{Json, OFormat}

case class NotionalTax(chargeableGains: Option[BigDecimal])

object NotionalTax {
  implicit val format: OFormat[NotionalTax] = Json.format[NotionalTax]
}