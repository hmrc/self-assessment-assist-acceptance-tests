/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class ReliefsV2(residentialFinanceCosts: ResidentialFinanceCostsV2,
                     foreignTaxCreditRelief: ForeignTaxCreditReliefV2,
                     pensionContributionReliefs: PensionContributionReliefsV2,
                     reliefsClaimed: Seq[ReliefsClaimedV2],
                     topSlicingRelief: TopSlicingReliefV2)

object ReliefsV2 {
  implicit val format: OFormat[ReliefsV2] = Json.format[ReliefsV2]
}
