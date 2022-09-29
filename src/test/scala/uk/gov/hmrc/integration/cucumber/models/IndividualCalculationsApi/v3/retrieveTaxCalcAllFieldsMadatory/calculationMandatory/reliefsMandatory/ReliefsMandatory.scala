/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class ReliefsMandatory(residentialFinanceCosts: ResidentialFinanceCostsMandatory,
                            reliefsClaimed: Seq[ReliefsClaimedMandatory],
                            foreignTaxCreditRelief: ForeignTaxCreditReliefMandatory,
                            topSlicingRelief: TopSlicingReliefMandatory)

object ReliefsMandatory {
  implicit val format: OFormat[ReliefsMandatory] = Json.format[ReliefsMandatory]
}