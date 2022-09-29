/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json.{Json, OFormat}

case class MessageMandatory(id: String,
                            text: String)

object MessageMandatory {
  implicit val format: OFormat[MessageMandatory] = Json.format[MessageMandatory]
}