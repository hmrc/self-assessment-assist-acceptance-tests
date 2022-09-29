/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome

import play.api.libs.json.{Json, OFormat}

case class BusinessReceipts(grossAmount: BigDecimal, taxYear: String)

object BusinessReceipts {
  implicit val format: OFormat[BusinessReceipts] = Json.format[BusinessReceipts]
}
