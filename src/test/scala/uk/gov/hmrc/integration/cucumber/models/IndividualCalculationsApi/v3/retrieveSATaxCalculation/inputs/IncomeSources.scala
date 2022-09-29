/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class IncomeSources(businessIncomeSources: Option[Seq[BusinessIncomeSources]],
                         nonBusinessIncomeSources: Option[Seq[NonBusinessIncomeSources]])

object IncomeSources {
  implicit val format: OFormat[IncomeSources] = Json.format[IncomeSources]
}