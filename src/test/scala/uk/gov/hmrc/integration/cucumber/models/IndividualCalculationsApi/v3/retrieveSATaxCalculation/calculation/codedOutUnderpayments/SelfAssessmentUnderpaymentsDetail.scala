/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.codedOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class SelfAssessmentUnderpaymentsDetail(amount: BigDecimal,
                                             relatedTaxYear: String,
                                             source: String,
                                             collectedAmount: Option[BigDecimal],
                                             uncollectedAmount: Option[BigDecimal])

object SelfAssessmentUnderpaymentsDetail {
  implicit val format: OFormat[SelfAssessmentUnderpaymentsDetail] = Json.format[SelfAssessmentUnderpaymentsDetail]
}