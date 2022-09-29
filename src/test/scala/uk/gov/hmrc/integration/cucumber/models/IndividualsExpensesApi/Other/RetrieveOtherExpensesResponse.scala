/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsExpensesApi.Other

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveOtherExpensesResponse(submittedOn: String,
                                         paymentsToTradeUnionsForDeathBenefits: Option[TradeUnions],
                                         patentRoyaltiesPayments: Option[Royalties],
                                         links: Seq[HateoasLink])

object RetrieveOtherExpensesResponse {
  implicit val format: OFormat[RetrieveOtherExpensesResponse] = Json.format[RetrieveOtherExpensesResponse]
}
