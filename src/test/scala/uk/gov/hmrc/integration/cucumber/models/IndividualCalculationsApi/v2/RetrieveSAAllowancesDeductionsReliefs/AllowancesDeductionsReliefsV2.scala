/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail.CalculationDetailV2
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.summary.CalculationSummaryV2
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AllowancesDeductionsReliefsV2(summary: CalculationSummaryV2, detail: CalculationDetailV2, links: Seq[HateoasLink])

object AllowancesDeductionsReliefsV2 {
  implicit val format: OFormat[AllowancesDeductionsReliefsV2] = Json.format[AllowancesDeductionsReliefsV2]
}
