/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveChargeHistory

import play.api.libs.json.{Json, OFormat}

case class HistoricItem(taxYear: Option[String],
                        transactionId: Option[String],
                        transactionDate: Option[String],
                        `type`: Option[String],
                        amount: Option[BigDecimal],
                        reversalDate: Option[String],
                        reversalReason: Option[String])

object HistoricItem {
  implicit val format: OFormat[HistoricItem] = Json.format[HistoricItem]
}
