/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class ReliefsClaimed(`type`: String,
                          amountClaimed: Option[BigDecimal],
                          allowableAmount: Option[BigDecimal],
                          amountUsed: Option[BigDecimal],
                          rate: Option[BigDecimal],
                          reliefsClaimedDetail: Option[Seq[ReliefClaimedDetail]])

object ReliefsClaimed {
  implicit val format: OFormat[ReliefsClaimed] = Json.format[ReliefsClaimed]
}