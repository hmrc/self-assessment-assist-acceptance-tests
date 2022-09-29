/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class TaxableLumpSumsAndCertainIncomeItem(amount: BigDecimal, taxPaid: Option[BigDecimal], taxTakenOffInEmployment: Boolean)

object TaxableLumpSumsAndCertainIncomeItem {
  implicit val format: OFormat[TaxableLumpSumsAndCertainIncomeItem] = Json.format[TaxableLumpSumsAndCertainIncomeItem]
}
