/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class RedundancyCompensationPaymentsOverExemptionMandatory(amount: BigDecimal,
                                                                taxPaid: BigDecimal,
                                                                taxTakenOffInEmployment: Boolean)

object RedundancyCompensationPaymentsOverExemptionMandatory {
  implicit val format: OFormat[RedundancyCompensationPaymentsOverExemptionMandatory] = Json.format[RedundancyCompensationPaymentsOverExemptionMandatory]
}