/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class AnnualPaymentsV2(grossAnnualPayments: Option[BigDecimal], reliefClaimed: Option[BigDecimal], rate: Option[BigDecimal])

object AnnualPaymentsV2 {
  implicit val format: OFormat[AnnualPaymentsV2] = Json.format[AnnualPaymentsV2]
}
