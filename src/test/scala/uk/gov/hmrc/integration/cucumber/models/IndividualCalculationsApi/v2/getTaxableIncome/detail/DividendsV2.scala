/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class DividendsV2(incomeReceived: BigInt, taxableIncome: BigInt, totalUkDividends: Option[BigInt], totalForeignDividends: Option[BigInt])

object DividendsV2 {
  implicit val formats: OFormat[DividendsV2] = Json.format[DividendsV2]
}
