/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferredInV2(amount: Option[BigDecimal], rate: Option[BigDecimal])

object MarriageAllowanceTransferredInV2 {
  implicit val format: OFormat[MarriageAllowanceTransferredInV2] = Json.format[MarriageAllowanceTransferredInV2]
}
