/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class CalculationDetailV2(allowancesAndDeductions: Option[AllowancesAndDeductionsV2], reliefs: Option[ReliefsV2])

object CalculationDetailV2 {
  implicit val format: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
