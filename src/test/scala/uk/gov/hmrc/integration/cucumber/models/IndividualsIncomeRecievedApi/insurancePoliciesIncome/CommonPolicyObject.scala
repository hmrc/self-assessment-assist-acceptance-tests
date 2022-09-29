/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.insurancePoliciesIncome

import play.api.libs.json.{Json, OFormat}

case class CommonPolicyObject(customerReference: Option[String],
                              event: Option[String],
                              gainAmount: BigDecimal,
                              taxPaid: Boolean,
                              yearsHeld: Option[Int],
                              yearsHeldSinceLastGain: Option[Int],
                              deficiencyRelief: Option[BigDecimal])

object CommonPolicyObject {
  implicit val format: OFormat[CommonPolicyObject] = Json.format[CommonPolicyObject]
}
