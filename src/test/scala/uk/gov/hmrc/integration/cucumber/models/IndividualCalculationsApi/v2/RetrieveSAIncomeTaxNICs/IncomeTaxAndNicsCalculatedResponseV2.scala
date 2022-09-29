/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class IncomeTaxAndNicsCalculatedResponseV2(summary: CalculationSummaryV2, detail: CalculationDetailV2, links: Seq[HateoasLink])

object IncomeTaxAndNicsCalculatedResponseV2 {
  implicit val format: OFormat[IncomeTaxAndNicsCalculatedResponseV2] = Json.format[IncomeTaxAndNicsCalculatedResponseV2]
}
