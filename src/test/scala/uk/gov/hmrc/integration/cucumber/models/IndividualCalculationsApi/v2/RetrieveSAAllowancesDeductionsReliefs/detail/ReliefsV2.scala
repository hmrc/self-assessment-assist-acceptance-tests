/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class ReliefsV2(residentialFinanceCosts: Option[ResidentialFinanceCostsV2],
                     foreignTaxCreditRelief: Option[ForeignTaxCreditReliefV2],
                     pensionContributionReliefs: Option[PensionContributionReliefsV2],
                     reliefsClaimed: Option[Seq[ReliefsClaimedV2]],
                     topSlicingRelief: Option[TopSlicingReliefV2])

object ReliefsV2 {
  implicit val format: OFormat[ReliefsV2] = Json.format[ReliefsV2]
}
