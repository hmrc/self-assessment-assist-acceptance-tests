/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferOutV2(personalAllowanceBeforeTransferOut: BigDecimal, transferredOutAmount: BigDecimal)

object MarriageAllowanceTransferOutV2 {
  implicit val format: OFormat[MarriageAllowanceTransferOutV2] = Json.format[MarriageAllowanceTransferOutV2]
}
