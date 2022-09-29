/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listTransactions

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListTransactions(transactions: Seq[TransactionItem], links: Seq[HateoasLink])

object ListTransactions {
  implicit val format: OFormat[ListTransactions] = Json.format[ListTransactions]
}
