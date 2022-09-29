/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome

import play.api.libs.json.{Json, OFormat}

case class OmittedForeignIncome(amount: BigDecimal)

object OmittedForeignIncome {
  implicit val format: OFormat[OmittedForeignIncome] = Json.format[OmittedForeignIncome]
}
