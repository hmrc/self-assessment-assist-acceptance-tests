/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}

case class VctSubscriptions(uniqueInvestmentRef: String,
                            name: Option[String],
                            dateOfInvestment: Option[String],
                            amountInvested: Option[BigDecimal],
                            reliefClaimed: Option[BigDecimal])

object VctSubscriptions {
  implicit val format: OFormat[VctSubscriptions] = Json.format[VctSubscriptions]
}
