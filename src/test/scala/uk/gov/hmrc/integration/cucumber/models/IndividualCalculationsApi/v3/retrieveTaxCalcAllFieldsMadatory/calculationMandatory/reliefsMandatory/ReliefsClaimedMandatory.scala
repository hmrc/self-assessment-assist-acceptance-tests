/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class ReliefsClaimedMandatory(`type`: String,
                                   amountClaimed: BigDecimal,
                                   allowableAmount: BigDecimal,
                                   amountUsed: BigDecimal,
                                   rate: BigDecimal,
                                   reliefsClaimedDetail: Seq[ReliefClaimedDetailMandatory])

object ReliefsClaimedMandatory {
  implicit val format: OFormat[ReliefsClaimedMandatory] = Json.format[ReliefsClaimedMandatory]
}