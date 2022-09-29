/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas

import play.api.libs.json.{Json, OFormat}

case class BusinessSourceSummary(typeOfBusiness: String,
                                 selfEmploymentId: Option[String],
                                 accountingPeriod: AccountingPeriod,
                                 bsasEntries: Seq[BsasEntry])

object BusinessSourceSummary {
  implicit val format: OFormat[BusinessSourceSummary] = Json.format[BusinessSourceSummary]
}
