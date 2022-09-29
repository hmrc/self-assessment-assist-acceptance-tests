/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employments

import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink
import play.api.libs.json.{Json, OFormat}

case class ListEmployments(employments: Option[Seq[EmploymentItem]], customEmployments: Option[Seq[EmploymentItem]], links: Seq[HateoasLink])

object ListEmployments {
  implicit val format: OFormat[ListEmployments] = Json.format[ListEmployments]
}
