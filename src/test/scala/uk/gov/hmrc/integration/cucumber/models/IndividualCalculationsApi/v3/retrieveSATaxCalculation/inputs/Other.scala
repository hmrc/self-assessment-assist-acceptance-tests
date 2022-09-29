/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class Other(`type`: String,
                 submittedOn: Option[String])

object Other {
  implicit val format: OFormat[Other] =Json.format[Other]
}
