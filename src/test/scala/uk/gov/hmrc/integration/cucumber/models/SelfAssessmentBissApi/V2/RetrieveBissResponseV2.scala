/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBissApi.V2

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBissApi.Common.{Loss, Profit}

case class RetrieveBissResponseV2(total: Total, profit: Option[Profit], loss: Option[Loss])

object RetrieveBissResponseV2 {
  implicit val retrieveBissResponseV2: OFormat[RetrieveBissResponseV2] = Json.format[RetrieveBissResponseV2]
}
