/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}

case class CommunityInvestment(uniqueInvestmentRef: String,
                               name: Option[String],
                               dateOfInvestment: Option[String],
                               amountInvested: Option[BigDecimal],
                               reliefClaimed: Option[BigDecimal])

object CommunityInvestment {
  implicit val format: OFormat[CommunityInvestment] = Json.format[CommunityInvestment]
}
