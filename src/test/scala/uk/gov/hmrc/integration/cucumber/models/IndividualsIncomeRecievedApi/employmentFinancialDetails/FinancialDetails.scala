/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class FinancialDetails(submittedOn: String,
                            source: Option[String],
                            customerAdded: Option[String],
                            dateIgnored: Option[String],
                            employment: Employment,
                            links: Option[Seq[HateoasLink]])

object FinancialDetails {
  implicit val format: OFormat[FinancialDetails] = Json.format[FinancialDetails]
}
