/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.listBsas

import play.api.libs.json.{Json, OFormat}

case class ListBsasResponseV3(businessSources: Seq[BusinessSource])

object ListBsasResponseV3 {
  implicit val format: OFormat[ListBsasResponseV3] = Json.format[ListBsasResponseV3]
}
