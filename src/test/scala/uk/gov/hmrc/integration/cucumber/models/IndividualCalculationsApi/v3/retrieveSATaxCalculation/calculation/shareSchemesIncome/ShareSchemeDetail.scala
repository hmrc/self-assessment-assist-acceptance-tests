/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.shareSchemesIncome

import play.api.libs.json.{Json, OFormat}

case class ShareSchemeDetail(`type`: String,
                             employerName: Option[String],
                             employerRef: Option[String],
                             taxableAmount: BigDecimal)

object ShareSchemeDetail {
  implicit val format: OFormat[ShareSchemeDetail] = Json.format[ShareSchemeDetail]
}