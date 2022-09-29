/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class UkSavingsV2(savingsAccountId: String, savingsAccountName: String, grossIncome: BigDecimal, netIncome: BigDecimal, taxDeducted: BigDecimal)

object UkSavingsV2 {
  implicit val format: OFormat[UkSavingsV2] = Json.format[UkSavingsV2]
}
