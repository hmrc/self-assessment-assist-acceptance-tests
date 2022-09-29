/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Obligations

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Enums.TypeOfBusiness

case class Business(typeOfBusiness: TypeOfBusiness, businessId: String, obligationDetails: Seq[Obligation])

object Business {
  implicit val format: OFormat[Business] = Json.format[Business]
}
