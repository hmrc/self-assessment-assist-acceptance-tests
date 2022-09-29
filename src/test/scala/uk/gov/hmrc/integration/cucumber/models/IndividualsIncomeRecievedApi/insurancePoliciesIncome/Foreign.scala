/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.insurancePoliciesIncome

import play.api.libs.json.{Json, OFormat}

case class Foreign(customerReference: Option[String], gainAmount: BigDecimal, taxPaidAmount: Option[BigDecimal], yearsHeld: Option[Int])

object Foreign {
  implicit val format: OFormat[Foreign] = Json.format[Foreign]
}
