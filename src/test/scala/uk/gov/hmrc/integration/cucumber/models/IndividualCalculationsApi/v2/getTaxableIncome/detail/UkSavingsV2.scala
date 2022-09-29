/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class UkSavingsV2(savingsAccountId: Option[String],
                       savingsAccountName: Option[String],
                       grossIncome: BigDecimal,
                       netIncome: Option[BigDecimal],
                       taxDeducted: Option[BigDecimal])

object UkSavingsV2 {
  implicit val formats: OFormat[UkSavingsV2] = Json.format[UkSavingsV2]
}
