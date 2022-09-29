/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.CalculationDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.summary.CalculationSummaryV2

case class TaxableIncomeMandatoryV2(summary: CalculationSummaryV2, detail: CalculationDetailV2, links: Seq[HateoasLink])

object TaxableIncomeMandatoryV2 {
  implicit val format: OFormat[TaxableIncomeMandatoryV2] = Json.format[TaxableIncomeMandatoryV2]
}
