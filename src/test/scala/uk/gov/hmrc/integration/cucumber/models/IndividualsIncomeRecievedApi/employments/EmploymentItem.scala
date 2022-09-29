/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class EmploymentItem(employmentId: String, employerName: String, dateIgnored: Option[String], links: Seq[HateoasLink])

object EmploymentItem {
  implicit val format: OFormat[EmploymentItem] = Json.format[EmploymentItem]
}
