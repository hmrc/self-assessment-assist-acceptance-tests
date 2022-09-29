/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V2.retrieveSelfAssessmentChargeHistory

import play.api.libs.json.{Json, OFormat}


case class ChargeHistoryDetail(taxYear: Option[String],
                               transactionId: String,
                               transactionDate: String,
                               description: String,
                               totalAmount: BigDecimal,
                               changeDate: String,
                               changeReason: String) {

}
object ChargeHistoryDetail {
  implicit val format: OFormat[ChargeHistoryDetail] = Json.format[ChargeHistoryDetail]
}
