/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AddCustomEmployment(employmentId: String, links: Seq[HateoasLink])

object AddCustomEmployment {
  implicit val format: OFormat[AddCustomEmployment] = Json.format[AddCustomEmployment]
}
