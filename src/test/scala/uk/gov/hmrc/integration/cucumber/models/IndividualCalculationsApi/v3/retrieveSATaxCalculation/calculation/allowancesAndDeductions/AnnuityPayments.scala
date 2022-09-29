/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.allowancesAndDeductions

import play.api.libs.json.{Json, OFormat}

case class AnnuityPayments(reliefClaimed: Option[BigDecimal],
                           rate: Option[BigDecimal])

object AnnuityPayments {
  implicit val format: OFormat[AnnuityPayments] = Json.format[AnnuityPayments]
}