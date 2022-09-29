/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Employment

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveEmploymentExpensesResponse(submittedOn: String,
                                              totalExpenses: Option[BigDecimal],
                                              source: Option[String],
                                              dateIgnored: Option[String],
                                              expenses: Option[Expenses],
                                              links: Seq[HateoasLink])

object RetrieveEmploymentExpensesResponse {
  implicit val format: OFormat[RetrieveEmploymentExpensesResponse] = Json.format[RetrieveEmploymentExpensesResponse]
}
