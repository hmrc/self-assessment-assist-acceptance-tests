/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class TopSlicingRelief(amount: Option[BigDecimal])

object TopSlicingRelief {
  implicit val format: OFormat[TopSlicingRelief] = Json.format[TopSlicingRelief]
}