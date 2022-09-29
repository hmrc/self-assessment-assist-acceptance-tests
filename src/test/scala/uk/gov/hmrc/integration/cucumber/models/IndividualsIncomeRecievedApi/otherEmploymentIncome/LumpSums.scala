/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class LumpSums(employerName: String,
                    employerRef: String,
                    taxableLumpSumsAndCertainIncome: Option[TaxableLumpSumsAndCertainIncomeItem],
                    benefitFromEmployerFinancedRetirementScheme: Option[BenefitFromEmployerFinancedRetirementSchemeItem],
                    redundancyCompensationPaymentsOverExemption: Option[RedundancyCompensationPaymentsOverExemptionItem],
                    redundancyCompensationPaymentsUnderExemption: Option[RedundancyCompensationPaymentsUnderExemptionItem])

object LumpSums {
  implicit val format: OFormat[LumpSums] = Json.format[LumpSums]
}
