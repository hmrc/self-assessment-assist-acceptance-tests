/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.listBsas

import play.api.libs.json.{Json, OFormat}

case class UkPropertyBusinessSourceSummary(typeOfBusiness: String, accountingPeriod: AccountingPeriod, bsasEntries: Seq[BsasEntry])

object UkPropertyBusinessSourceSummary {
  implicit val format: OFormat[UkPropertyBusinessSourceSummary] = Json.format[UkPropertyBusinessSourceSummary]
}
