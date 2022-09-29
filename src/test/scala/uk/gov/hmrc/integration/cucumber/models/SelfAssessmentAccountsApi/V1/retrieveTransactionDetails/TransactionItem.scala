/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveTransactionDetails

import play.api.libs.json.{Json, OFormat}

case class TransactionItem(transactionItemId: Option[String],
                           `type`: Option[String],
                           taxPeriodFrom: Option[String],
                           taxPeriodTo: Option[String],
                           originalAmount: Option[BigDecimal],
                           outstandingAmount: Option[BigDecimal],
                           dueDate: Option[String],
                           paymentMethod: Option[String],
                           paymentId: Option[String],
                           subItems: Seq[SubItem])

object TransactionItem {
  implicit val format: OFormat[TransactionItem] = Json.format[TransactionItem]
}
