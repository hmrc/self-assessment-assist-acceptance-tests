/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.CalculationDetailV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.summary.CalculationSummaryV2
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class TaxableIncomeV2(summary: CalculationSummaryV2, detail: CalculationDetailV2, links: Seq[HateoasLink])

object TaxableIncomeV2 {
  implicit val format: OFormat[TaxableIncomeV2] = Json.format[TaxableIncomeV2]
}
