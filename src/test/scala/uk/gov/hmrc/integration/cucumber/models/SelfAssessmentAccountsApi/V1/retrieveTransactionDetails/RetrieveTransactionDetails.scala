/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveTransactionDetails

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveTransactionDetails(transactionItems: Seq[TransactionItem], links: Seq[HateoasLink])

object RetrieveTransactionDetails {
  implicit val format: OFormat[RetrieveTransactionDetails] = Json.format[RetrieveTransactionDetails]
}
