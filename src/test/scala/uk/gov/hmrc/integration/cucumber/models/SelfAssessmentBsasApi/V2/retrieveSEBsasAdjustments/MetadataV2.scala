/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsasAdjustments

import play.api.libs.json.{Json, OFormat}

case class MetadataV2(typeOfBusiness: String,
                      businessId: String,
                      accountingPeriod: AccountingPeriod,
                      taxYear: String,
                      requestedDateTime: String,
                      bsasId: String,
                      summaryStatus: String,
                      adjustedSummary: Boolean)

object MetadataV2 {
  implicit val format: OFormat[MetadataV2] = Json.format[MetadataV2]
}
