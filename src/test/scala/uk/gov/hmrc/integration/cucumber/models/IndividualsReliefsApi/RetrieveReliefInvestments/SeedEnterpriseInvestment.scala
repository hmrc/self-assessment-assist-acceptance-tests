/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}

case class SeedEnterpriseInvestment(uniqueInvestmentRef: String,
                                    companyName: Option[String],
                                    dateOfInvestment: Option[String],
                                    amountInvested: Option[BigDecimal],
                                    reliefClaimed: Option[BigDecimal])

object SeedEnterpriseInvestment {
  implicit val format: OFormat[SeedEnterpriseInvestment] = Json.format[SeedEnterpriseInvestment]
}
