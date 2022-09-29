/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class LumpSumsV2(incomeReceived: BigInt, taxableIncome: BigInt)

object LumpSumsV2 {
  implicit val formats: OFormat[LumpSumsV2] = Json.format[LumpSumsV2]
}
