/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsUnderExemptionMandatory(amount: BigDecimal)

object RedundancyCompensationPaymentsUnderExemptionMandatory {
  implicit val format: OFormat[RedundancyCompensationPaymentsUnderExemptionMandatory] = Json.format[RedundancyCompensationPaymentsUnderExemptionMandatory]
}