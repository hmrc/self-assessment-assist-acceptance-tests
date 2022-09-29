/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.previousCalculationMandatory

import play.api.libs.json.{Json, OFormat}

case class PreviousCalculationMandatory(calculationTimestamp: String,
                                        calculationId: String,
                                        totalIncomeTaxAndNicsDue: BigDecimal,
                                        cgtTaxDue: BigDecimal,
                                        totalIncomeTaxAndNicsAndCgtDue: BigDecimal,
                                        incomeTaxNicDueThisPeriod: BigDecimal,
                                        cgtDueThisPeriod: BigDecimal,
                                        totalIncomeTaxAndNicsAndCgtDueThisPeriod: BigDecimal)

object PreviousCalculationMandatory {
  implicit val format: OFormat[PreviousCalculationMandatory] = Json.format[PreviousCalculationMandatory]
}