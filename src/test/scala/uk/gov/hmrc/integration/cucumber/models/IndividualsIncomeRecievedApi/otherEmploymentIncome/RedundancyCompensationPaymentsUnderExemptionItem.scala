/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsUnderExemptionItem(amount: Option[BigDecimal])

object RedundancyCompensationPaymentsUnderExemptionItem {
  implicit val format: OFormat[RedundancyCompensationPaymentsUnderExemptionItem] = Json.format[RedundancyCompensationPaymentsUnderExemptionItem]
}
