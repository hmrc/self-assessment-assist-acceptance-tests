/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class LumpSumsDetailMandatory(taxableLumpSumsAndCertainIncome: TaxableLumpSumsAndCertainIncomeMandatory,
                                   benefitFromEmployerFinancedRetirementScheme: BenefitFromEmployerFinancedRetirementSchemeMandatory,
                                   redundancyCompensationPaymentsOverExemption: RedundancyCompensationPaymentsOverExemptionMandatory,
                                   redundancyCompensationPaymentsUnderExemption: RedundancyCompensationPaymentsUnderExemptionMandatory)

object LumpSumsDetailMandatory {
  implicit val format: OFormat[LumpSumsDetailMandatory] = Json.format[LumpSumsDetailMandatory]
}