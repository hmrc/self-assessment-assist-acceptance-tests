/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveTransactionDetails

import play.api.libs.json.{Json, OFormat}

case class SubItem(subItemId: Option[String],
                   amount: Option[BigDecimal],
                   clearingDate: Option[String],
                   clearingReason: Option[String],
                   outgoingPaymentMethod: Option[String],
                   paymentAmount: Option[BigDecimal],
                   paymentMethod: Option[String],
                   paymentId: Option[String])

object SubItem {
  implicit val format: OFormat[SubItem] = Json.format[SubItem]
}
