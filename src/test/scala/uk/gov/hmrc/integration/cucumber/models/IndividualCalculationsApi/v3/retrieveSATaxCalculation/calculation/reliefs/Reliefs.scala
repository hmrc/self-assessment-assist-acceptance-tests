/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class Reliefs (residentialFinanceCosts: ResidentialFinanceCosts,
                    reliefsClaimed: Option[Seq[ReliefsClaimed]],
                    foreignTaxCreditRelief: ForeignTaxCreditRelief,
                    topSlicingRelief: TopSlicingRelief)

object Reliefs {
  implicit val format: OFormat[Reliefs] = Json.format[Reliefs]
}