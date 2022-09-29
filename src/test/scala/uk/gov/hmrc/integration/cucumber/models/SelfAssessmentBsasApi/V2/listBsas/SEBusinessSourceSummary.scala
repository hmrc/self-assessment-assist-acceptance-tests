/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas

import play.api.libs.json.{Json, OFormat}

case class SEBusinessSourceSummary(typeOfBusiness: String, selfEmploymentId: String, accountingPeriod: AccountingPeriod, bsasEntries: Seq[BsasEntry])

object SEBusinessSourceSummary {
  implicit val format: OFormat[SEBusinessSourceSummary] = Json.format[SEBusinessSourceSummary]
}
