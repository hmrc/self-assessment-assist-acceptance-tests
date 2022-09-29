/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.listSEPeriodSummaries

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListSEPeriodSummaries(periods: Seq[Periods], links: Seq[HateoasLink])

object ListSEPeriodSummaries {
  implicit val format: OFormat[ListSEPeriodSummaries] = Json.format[ListSEPeriodSummaries]
}
