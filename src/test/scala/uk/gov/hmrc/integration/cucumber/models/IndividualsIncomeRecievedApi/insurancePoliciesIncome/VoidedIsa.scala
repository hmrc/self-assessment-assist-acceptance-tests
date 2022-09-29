/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.insurancePoliciesIncome

import play.api.libs.json.{Json, OFormat}

case class VoidedIsa(customerReference: Option[String],
                     event: Option[String],
                     gainAmount: BigDecimal,
                     taxPaidAmount: Option[BigDecimal],
                     yearsHeld: Option[Int],
                     yearsHeldSinceLastGain: Option[Int])

object VoidedIsa {
  implicit val format: OFormat[VoidedIsa] = Json.format[VoidedIsa]
}
