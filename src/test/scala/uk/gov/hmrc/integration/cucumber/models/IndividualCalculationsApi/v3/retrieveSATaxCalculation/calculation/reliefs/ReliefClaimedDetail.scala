/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs

import play.api.libs.json.{Json, OFormat}

case class ReliefClaimedDetail(amountClaimed: Option[BigDecimal],
                               uniqueInvestmentRef: Option[String],
                               name: Option[String],
                               socialEnterpriseName: Option[String],
                               companyName: Option[String],
                               deficiencyReliefType: Option[String],
                               customerReference: Option[String])

object ReliefClaimedDetail {
  implicit val format: OFormat[ReliefClaimedDetail] = Json.format[ReliefClaimedDetail]
}