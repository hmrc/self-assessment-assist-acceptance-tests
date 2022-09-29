/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class TriggerSATaxCalculationV2(id: String, links: Seq[HateoasLink])

object TriggerSATaxCalculationV2 {
  implicit val format: OFormat[TriggerSATaxCalculationV2] = Json.format[TriggerSATaxCalculationV2]
}
