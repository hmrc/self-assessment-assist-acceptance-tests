/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveUkPropBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Enums.Status

case class MetadataV3(calculationId: String,
                      requestedDateTime: String,
                      adjustedDateTime: Option[String],
                      nino: String,
                      taxYear: String,
                      summaryStatus: Status)

object MetadataV3 {
  implicit val format: OFormat[MetadataV3] = Json.format[MetadataV3]
}
