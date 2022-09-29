/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferredInV2(amount: BigDecimal, rate: BigDecimal)

object MarriageAllowanceTransferredInV2 {
  implicit val format: OFormat[MarriageAllowanceTransferredInV2] = Json.format[MarriageAllowanceTransferredInV2]
}
