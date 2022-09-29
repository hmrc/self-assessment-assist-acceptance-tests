/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getEndOfYearEstimateMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class EoyEstimateForeignPensionV2(taxableIncome: BigInt)

object EoyEstimateForeignPensionV2 {
  implicit val format: OFormat[EoyEstimateForeignPensionV2] = Json.format[EoyEstimateForeignPensionV2]
}
