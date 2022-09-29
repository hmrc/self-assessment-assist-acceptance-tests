/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualDisclosuresApi

import play.api.libs.json.{Json, OFormat}

case class TaxAvoidance(srn: String, taxYear: String)

object TaxAvoidance {
  implicit val format: OFormat[TaxAvoidance] = Json.format[TaxAvoidance]
}
