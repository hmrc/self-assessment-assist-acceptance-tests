/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.CisDeductionsApi

import play.api.libs.json._

case class CisDeductions(fromDate: String,
                         toDate: String,
                         contractorName: String,
                         employerRef: String,
                         totalDeductionAmount: BigDecimal,
                         totalCostOfMaterials: BigDecimal,
                         totalGrossAmountPaid: BigDecimal,
                         periodData: Seq[PeriodData])

object CisDeductions {
  implicit val reads: Reads[CisDeductions]    = Json.reads[CisDeductions]
  implicit val writes: OWrites[CisDeductions] = Json.writes[CisDeductions]
}
