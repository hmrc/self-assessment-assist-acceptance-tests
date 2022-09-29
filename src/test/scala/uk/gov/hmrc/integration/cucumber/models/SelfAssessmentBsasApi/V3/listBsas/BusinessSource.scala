/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.listBsas

import play.api.libs.json.{Json, OFormat}

case class BusinessSource(businessId: String, typeOfBusiness: String, accountingPeriod: AccountingPeriod, taxYear: String, summaries: Seq[Summary])

object BusinessSource {
  implicit val format: OFormat[BusinessSource] = Json.format[BusinessSource]
}
