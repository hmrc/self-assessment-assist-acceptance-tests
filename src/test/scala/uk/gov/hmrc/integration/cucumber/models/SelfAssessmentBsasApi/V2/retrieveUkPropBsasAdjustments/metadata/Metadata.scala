/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.metadata

import play.api.libs.json.{Json, OFormat}

case class Metadata(typeOfBusiness: String,
                    businessId: Option[String],
                    accountingPeriod: AccountingPeriod,
                    taxYear: String,
                    requestedDateTime: String,
                    bsasId: String,
                    summaryStatus: String,
                    adjustedSummary: Boolean)

object Metadata {
  implicit val format: OFormat[Metadata] = Json.format[Metadata]
}
