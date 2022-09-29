/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.codedOutUnderpaymentsMandatory

import play.api.libs.json.{Json, OFormat}

case class CodedOutUnderpaymentsMandatory(totalPayeUnderpayments: BigDecimal,
                                          payeUnderpaymentsDetail: Seq[PayeUnderpaymentsDetailMandatory],
                                          totalSelfAssessmentUnderpayments: BigDecimal,
                                          totalCollectedSelfAssessmentUnderpayments: BigDecimal,
                                          totalUncollectedSelfAssessmentUnderpayments: BigDecimal,
                                          selfAssessmentUnderpaymentsDetail: Seq[SelfAssessmentUnderpaymentsDetailMandatory])

object CodedOutUnderpaymentsMandatory {
  implicit val format: OFormat[CodedOutUnderpaymentsMandatory] = Json.format[CodedOutUnderpaymentsMandatory]
}