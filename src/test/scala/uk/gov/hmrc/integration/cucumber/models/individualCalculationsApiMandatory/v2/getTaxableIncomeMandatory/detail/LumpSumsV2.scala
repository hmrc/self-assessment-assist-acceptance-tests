/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class LumpSumsV2(incomeReceived: BigInt, taxableIncome: BigInt)

object LumpSumsV2 {
  implicit val format: OFormat[LumpSumsV2] = Json.format[LumpSumsV2]
}
