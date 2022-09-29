/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}

case class EisSubscriptions(uniqueInvestmentRef: String,
                            name: Option[String],
                            knowledgeIntensive: Option[Boolean],
                            dateOfInvestment: Option[String],
                            amountInvested: Option[BigDecimal],
                            reliefClaimed: Option[BigDecimal])

object EisSubscriptions {
  implicit val format: OFormat[EisSubscriptions] = Json.format[EisSubscriptions]
}
