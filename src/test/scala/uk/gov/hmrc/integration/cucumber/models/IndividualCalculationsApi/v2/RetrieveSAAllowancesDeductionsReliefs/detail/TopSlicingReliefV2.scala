/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class TopSlicingReliefV2(amount: Option[BigDecimal])

object TopSlicingReliefV2 {
  implicit val format: OFormat[TopSlicingReliefV2] = Json.format[TopSlicingReliefV2]
}
