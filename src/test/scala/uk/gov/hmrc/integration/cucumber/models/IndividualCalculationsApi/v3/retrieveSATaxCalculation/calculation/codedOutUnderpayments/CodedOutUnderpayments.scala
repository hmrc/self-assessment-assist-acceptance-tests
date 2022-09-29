/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.codedOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class CodedOutUnderpayments(totalPayeUnderpayments: Option[BigDecimal],
                                 payeUnderpaymentsDetail: Option[Seq[PayeUnderpaymentsDetail]],
                                 totalSelfAssessmentUnderpayments: Option[BigDecimal],
                                 totalCollectedSelfAssessmentUnderpayments: Option[BigDecimal],
                                 totalUncollectedSelfAssessmentUnderpayments: Option[BigDecimal],
                                 selfAssessmentUnderpaymentsDetail: Option[Seq[SelfAssessmentUnderpaymentsDetail]])

object CodedOutUnderpayments {
  implicit val format: OFormat[CodedOutUnderpayments] = Json.format[CodedOutUnderpayments]
}