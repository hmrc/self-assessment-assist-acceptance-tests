/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.CalculationDetailV2
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.summary.CalculationSummaryV2

case class AllowancesDeductionsReliefsMandatoryV2(summary: CalculationSummaryV2, detail: CalculationDetailV2, links: Seq[HateoasLink])

object AllowancesDeductionsReliefsMandatoryV2 {
  implicit val format: OFormat[AllowancesDeductionsReliefsMandatoryV2] = Json.format[AllowancesDeductionsReliefsMandatoryV2]
}
