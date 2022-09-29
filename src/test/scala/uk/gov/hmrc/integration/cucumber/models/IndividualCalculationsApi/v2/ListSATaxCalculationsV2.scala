/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListSATaxCalculationsV2(calculations: List[SATaxCalculationV2])

case class SATaxCalculationV2(id: String, calculationTimestamp: String, `type`: String, requestedBy: Option[String] = None, links: Seq[HateoasLink])

object SATaxCalculationV2 {
  implicit val format: OFormat[SATaxCalculationV2] = Json.format[SATaxCalculationV2]
}

object ListSATaxCalculationsV2 {
  implicit val format: OFormat[ListSATaxCalculationsV2] = Json.format[ListSATaxCalculationsV2]
}
