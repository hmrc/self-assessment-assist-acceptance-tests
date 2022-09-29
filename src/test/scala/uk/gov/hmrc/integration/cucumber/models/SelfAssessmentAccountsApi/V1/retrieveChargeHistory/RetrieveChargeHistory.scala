/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveChargeHistory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveChargeHistory(history: Option[Seq[HistoricItem]], links: Seq[HateoasLink])

object RetrieveChargeHistory {
  implicit val format: OFormat[RetrieveChargeHistory] = Json.format[RetrieveChargeHistory]
}
