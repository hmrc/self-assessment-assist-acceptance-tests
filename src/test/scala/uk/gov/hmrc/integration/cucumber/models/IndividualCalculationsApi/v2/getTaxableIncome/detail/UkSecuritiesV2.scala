/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail

import play.api.libs.json._

case class UkSecuritiesV2(grossIncome: BigDecimal, netIncome: Option[BigDecimal], taxDeducted: Option[BigDecimal])

object UkSecuritiesV2 {
  implicit val formats: OFormat[UkSecuritiesV2] = Json.format[UkSecuritiesV2]
}
