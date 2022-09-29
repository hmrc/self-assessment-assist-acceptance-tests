/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignFhlEea.ForeignFhlEea
import uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveForeignPropertyPeriodSummaryResponse.foreignNonFhlProperty.ForeignNonFhlProperty
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveForeignPropertyPeriodSummaryResponse(submittedOn: String,
                                                        fromDate: String,
                                                        toDate: String,
                                                        foreignFhlEea: Option[ForeignFhlEea],
                                                        foreignNonFhlProperty: Option[Seq[ForeignNonFhlProperty]],
                                                        links: Seq[HateoasLink])

object RetrieveForeignPropertyPeriodSummaryResponse {
  implicit val format: OFormat[RetrieveForeignPropertyPeriodSummaryResponse] = Json.format[RetrieveForeignPropertyPeriodSummaryResponse]
}
