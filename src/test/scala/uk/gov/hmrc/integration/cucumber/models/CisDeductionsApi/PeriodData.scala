/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.CisDeductionsApi

import play.api.libs.json._

case class PeriodData(deductionFromDate: String,
                      deductionToDate: String,
                      deductionAmount: BigDecimal,
                      costOfMaterials: BigDecimal,
                      grossAmountPaid: BigDecimal,
                      submissionDate: String,
                      submissionId: Option[String],
                      source: String)

object PeriodData {
  implicit val reads: Reads[PeriodData]   = Json.reads[PeriodData]
  implicit val writes: Writes[PeriodData] = Json.writes[PeriodData]
}
