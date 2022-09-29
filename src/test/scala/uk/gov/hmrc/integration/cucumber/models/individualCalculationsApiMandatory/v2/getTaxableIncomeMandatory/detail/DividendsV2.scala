/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class DividendsV2(incomeReceived: BigInt, taxableIncome: BigInt, totalUkDividends: BigInt, totalForeignDividends: BigInt)

object DividendsV2 {
  implicit val format: OFormat[DividendsV2] = Json.format[DividendsV2]
}
