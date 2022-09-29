/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class CalculationDetailV2(allowancesAndDeductions: AllowancesAndDeductionsV2, reliefs: ReliefsV2)

object CalculationDetailV2 {
  implicit val format: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
