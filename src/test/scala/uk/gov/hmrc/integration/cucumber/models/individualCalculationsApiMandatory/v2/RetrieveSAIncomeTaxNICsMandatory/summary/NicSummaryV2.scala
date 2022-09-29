/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.summary

import play.api.libs.json._

case class NicSummaryV2(class2NicsAmount: BigDecimal, class4NicsAmount: BigDecimal, totalNic: BigDecimal)

object NicSummaryV2 {
  implicit val format: OFormat[NicSummaryV2] = Json.format[NicSummaryV2]
}
