/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSAMetadataV2(id: String,
                                taxYear: String,
                                requestedBy: String,
                                calculationReason: String,
                                calculationTimestamp: String,
                                calculationType: String,
                                intentToCrystallise: Boolean,
                                crystallised: Boolean,
                                calculationErrorCount: Option[Int] = None,
                                links: Seq[HateoasLink])

object RetrieveSAMetadataV2 {
  implicit val format: OFormat[RetrieveSAMetadataV2] = Json.format[RetrieveSAMetadataV2]
}
