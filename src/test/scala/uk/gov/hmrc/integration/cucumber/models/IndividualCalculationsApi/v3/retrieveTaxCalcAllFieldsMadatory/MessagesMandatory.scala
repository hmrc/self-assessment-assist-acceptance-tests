/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json.{Json, OFormat}

case class MessagesMandatory(info: Seq[MessageMandatory],
                             warnings: Seq[MessageMandatory],
                             errors: Seq[MessageMandatory])

object MessagesMandatory {
  implicit val format: OFormat[MessagesMandatory] = Json.format[MessagesMandatory]
}