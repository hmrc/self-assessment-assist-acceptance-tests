/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.previousCalculation

import play.api.libs.json.{Json, OFormat}

case class PreviousCalculation(calculationTimestamp: Option[String],
                               calculationId: Option[String],
                               totalIncomeTaxAndNicsDue: Option[BigDecimal],
                               cgtTaxDue: Option[BigDecimal],
                               totalIncomeTaxAndNicsAndCgtDue: Option[BigDecimal],
                               incomeTaxNicDueThisPeriod: Option[BigDecimal],
                               cgtDueThisPeriod: Option[BigDecimal],
                               totalIncomeTaxAndNicsAndCgtDueThisPeriod: Option[BigDecimal])

object PreviousCalculation {
  implicit val format: OFormat[PreviousCalculation] = Json.format[PreviousCalculation]
}