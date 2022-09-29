/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.marriageAllowanceTransferredIn

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferredIn(amount: Option[BigDecimal],
                                          rate: Option[BigDecimal])

object MarriageAllowanceTransferredIn {
  implicit val format: OFormat[MarriageAllowanceTransferredIn] = Json.format[MarriageAllowanceTransferredIn]
}