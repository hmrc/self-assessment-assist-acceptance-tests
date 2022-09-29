/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}

case class SocialEnterpriseInvestment(uniqueInvestmentRef: String,
                                      socialEnterpriseName: Option[String],
                                      dateOfInvestment: Option[String],
                                      amountInvested: Option[BigDecimal],
                                      reliefClaimed: Option[BigDecimal])

object SocialEnterpriseInvestment {
  implicit val format: OFormat[SocialEnterpriseInvestment] = Json.format[SocialEnterpriseInvestment]
}
