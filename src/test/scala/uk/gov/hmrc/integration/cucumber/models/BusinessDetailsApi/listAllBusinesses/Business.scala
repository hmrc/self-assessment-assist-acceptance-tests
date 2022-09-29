/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.listAllBusinesses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Business(businessId: String, typeOfBusiness: String, tradingName: Option[String], links: Seq[HateoasLink])

object Business {
  implicit val format: OFormat[Business] = Json.format[Business]
}
