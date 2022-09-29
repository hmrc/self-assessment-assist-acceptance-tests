/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.allowancesAndDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsDetailMandatory(retirementAnnuityPayments: BigDecimal,
                                               paymentToEmployersSchemeNoTaxRelief: BigDecimal,
                                               overseasPensionSchemeContributions: BigDecimal)

object PensionContributionsDetailMandatory {
  implicit val format: OFormat[PensionContributionsDetailMandatory] = Json.format[PensionContributionsDetailMandatory]
}