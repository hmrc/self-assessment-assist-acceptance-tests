/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class TriggerSATaxCalculationV3(calculationId: String, links: Seq[HateoasLink])

object TriggerSATaxCalculationV3 {
  implicit val format: OFormat[TriggerSATaxCalculationV3] = Json.format[TriggerSATaxCalculationV3]
}
