/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.listAllBusinesses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListBusinessesResponse(listOfBusinesses: Seq[Business], links: Seq[HateoasLink])

object ListBusinessesResponse {
  implicit val format: OFormat[ListBusinessesResponse] = Json.format[ListBusinessesResponse]
}
