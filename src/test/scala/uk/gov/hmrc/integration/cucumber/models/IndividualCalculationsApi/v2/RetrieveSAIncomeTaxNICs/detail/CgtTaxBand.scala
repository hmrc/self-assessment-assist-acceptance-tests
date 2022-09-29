/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class CgtTaxBand(name: String, rate: Option[BigDecimal], income: Option[BigDecimal], taxAmount: Option[BigDecimal])

object CgtTaxBand {
  implicit val format: OFormat[CgtTaxBand] = Json.format[CgtTaxBand]
}
