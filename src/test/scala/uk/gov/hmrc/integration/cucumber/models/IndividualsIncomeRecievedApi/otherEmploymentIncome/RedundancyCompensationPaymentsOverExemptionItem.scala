/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsOverExemptionItem(amount: BigDecimal, taxPaid: Option[BigDecimal], taxTakenOffInEmployment: Boolean)

object RedundancyCompensationPaymentsOverExemptionItem {
  implicit val format: OFormat[RedundancyCompensationPaymentsOverExemptionItem] = Json.format[RedundancyCompensationPaymentsOverExemptionItem]

}
