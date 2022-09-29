/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class OtherMandatory(`type`: String,
                          submittedOn: String)

object OtherMandatory {
  implicit val format: OFormat[OtherMandatory] =Json.format[OtherMandatory]
}
