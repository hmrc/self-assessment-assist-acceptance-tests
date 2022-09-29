/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListBsasResponse[T](businessSourceSummaries: Seq[T], links: Seq[HateoasLink])

object ListBsasResponse {

  implicit val format: OFormat[ListBsasResponse[BusinessSourceSummary]]     = Json.format[ListBsasResponse[BusinessSourceSummary]]
  implicit val formatSE: OFormat[ListBsasResponse[SEBusinessSourceSummary]] = Json.format[ListBsasResponse[SEBusinessSourceSummary]]

  implicit val formatUkProperty: OFormat[ListBsasResponse[UkPropertyBusinessSourceSummary]] =
    Json.format[ListBsasResponse[UkPropertyBusinessSourceSummary]]

}
