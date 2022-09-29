/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail.lumpSumsDetail

import play.api.libs.json.{Json, OFormat}

case class LumpSumsDetail(taxableLumpSumsAndCertainIncome: Option[TaxableLumpSumsAndCertainIncome],
                          benefitFromEmployerFinancedRetirementScheme: Option[BenefitFromEmployerFinancedRetirementScheme],
                          redundancyCompensationPaymentsOverExemption: Option[RedundancyCompensationPaymentsOverExemption],
                          redundancyCompensationPaymentsUnderExemption: Option[RedundancyCompensationPaymentsUnderExemption])

object LumpSumsDetail {
  implicit val format: OFormat[LumpSumsDetail] = Json.format[LumpSumsDetail]
}