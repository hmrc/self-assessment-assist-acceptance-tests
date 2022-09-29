/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.savingsIncome

import play.api.libs.json.{Json, OFormat}

case class Securities(taxTakenOff: Option[BigDecimal], grossAmount: BigDecimal, netAmount: Option[BigDecimal])

object Securities {
  implicit val format: OFormat[Securities] = Json.format[Securities]
}
