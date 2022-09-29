/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class TaxCodeComponentsObject(selfAssessmentUnderpayment: Seq[TaxCodeComponents],
                                   payeUnderpayment: Seq[TaxCodeComponents],
                                   debt: Seq[TaxCodeComponents],
                                   inYearAdjustment: TaxCodeComponents)

object TaxCodeComponentsObject {
  implicit val format: OFormat[TaxCodeComponentsObject] = Json.format[TaxCodeComponentsObject]
}
