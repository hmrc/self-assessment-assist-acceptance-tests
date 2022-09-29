/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.IntentToCrystallise

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class IntentToCrystalliseV2(calculationId: String, links: Option[Seq[HateoasLink]])

object IntentToCrystalliseV2 {
  implicit val format: OFormat[IntentToCrystalliseV2] = Json.format[IntentToCrystalliseV2]
}
