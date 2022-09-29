/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.summary

import play.api.libs.json._

case class NicSummaryV2(class2NicsAmount: Option[BigDecimal], class4NicsAmount: Option[BigDecimal], totalNic: Option[BigDecimal])

object NicSummaryV2 {
  implicit val format: OFormat[NicSummaryV2] = Json.format[NicSummaryV2]
}
