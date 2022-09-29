/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.codedOutUnderpaymentsMandatory

import play.api.libs.json.{Json, OFormat}

case class SelfAssessmentUnderpaymentsDetailMandatory(amount: BigDecimal,
                                                      relatedTaxYear: String,
                                                      source: String,
                                                      collectedAmount: BigDecimal,
                                                      uncollectedAmount: BigDecimal)

object SelfAssessmentUnderpaymentsDetailMandatory {
  implicit val format: OFormat[SelfAssessmentUnderpaymentsDetailMandatory] = Json.format[SelfAssessmentUnderpaymentsDetailMandatory]
}