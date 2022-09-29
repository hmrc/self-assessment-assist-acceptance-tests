/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listTransactions

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class TransactionItem(taxYear: String,
                           transactionId: String,
                           paymentId: Option[String],
                           transactionDate: String,
                           `type`: Option[String],
                           originalAmount: BigDecimal,
                           outstandingAmount: BigDecimal,
                           lastClearingDate: Option[String],
                           lastClearingReason: Option[String],
                           lastClearedAmount: Option[BigDecimal],
                           accruingInterestAmount: Option[BigDecimal],
                           interestRate: Option[BigDecimal],
                           interestFromDate: Option[String],
                           interestEndDate: Option[String],
                           latePaymentInterestAmount: Option[BigDecimal],
                           interestOutstandingAmount: Option[BigDecimal],
                           links: Seq[HateoasLink])

object TransactionItem {
  implicit val format: OFormat[TransactionItem] = Json.format[TransactionItem]
}
