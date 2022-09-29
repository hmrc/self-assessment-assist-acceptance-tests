/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employment

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Employment(employerRef: Option[String],
                      employerName: String,
                      startDate: Option[String],
                      cessationDate: Option[String],
                      payrollId: Option[String],
                      occupationalPension: Option[Boolean],
                      dateIgnored: Option[String],
                      submittedOn: Option[String],
                      links: Option[Seq[HateoasLink]])

object Employment {
  implicit val format: OFormat[Employment] = Json.format[Employment]
}
