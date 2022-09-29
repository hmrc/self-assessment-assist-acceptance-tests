/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail

import play.api.libs.json._

case class UkSecuritiesV2(grossIncome: BigDecimal, netIncome: BigDecimal, taxDeducted: BigDecimal)

object UkSecuritiesV2 {
  implicit val format: OFormat[UkSecuritiesV2] = Json.format[UkSecuritiesV2]
}
