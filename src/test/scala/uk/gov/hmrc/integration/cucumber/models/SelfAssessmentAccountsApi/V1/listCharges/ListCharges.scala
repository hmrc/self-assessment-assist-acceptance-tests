/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listCharges

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListCharges(charges: Seq[Charge], links: Seq[HateoasLink])

object ListCharges {
  implicit val format: OFormat[ListCharges] = Json.format[ListCharges]
}
