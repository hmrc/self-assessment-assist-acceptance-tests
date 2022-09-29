/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink


case class ListSATaxCalculationsV3(calculations: Seq[Calculations],
                                   links: Seq[HateoasLink])

object ListSATaxCalculationsV3 {
  implicit val format: OFormat[ListSATaxCalculationsV3] = Json.format[ListSATaxCalculationsV3]
}
