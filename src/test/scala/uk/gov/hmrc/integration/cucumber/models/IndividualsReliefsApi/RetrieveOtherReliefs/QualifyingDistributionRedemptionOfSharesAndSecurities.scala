/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class QualifyingDistributionRedemptionOfSharesAndSecurities(customerReference: Option[String], amount: BigDecimal)

object QualifyingDistributionRedemptionOfSharesAndSecurities {

  implicit val format: OFormat[QualifyingDistributionRedemptionOfSharesAndSecurities] =
    Json.format[QualifyingDistributionRedemptionOfSharesAndSecurities]

}
