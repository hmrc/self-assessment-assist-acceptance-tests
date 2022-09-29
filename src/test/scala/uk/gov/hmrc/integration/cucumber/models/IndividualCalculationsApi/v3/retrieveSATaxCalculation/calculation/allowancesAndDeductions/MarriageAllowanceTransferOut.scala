/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.allowancesAndDeductions

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferOut(personalAllowanceBeforeTransferOut: BigDecimal,
                                        transferredOutAmount: BigDecimal)

object MarriageAllowanceTransferOut {
  implicit val format: OFormat[MarriageAllowanceTransferOut] = Json.format[MarriageAllowanceTransferOut]
}