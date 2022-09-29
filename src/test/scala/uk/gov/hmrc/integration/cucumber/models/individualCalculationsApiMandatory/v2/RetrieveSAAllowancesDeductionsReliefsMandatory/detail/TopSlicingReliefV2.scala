/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class TopSlicingReliefV2(amount: BigDecimal)

object TopSlicingReliefV2 {
  implicit val format: OFormat[TopSlicingReliefV2] = Json.format[TopSlicingReliefV2]
}
