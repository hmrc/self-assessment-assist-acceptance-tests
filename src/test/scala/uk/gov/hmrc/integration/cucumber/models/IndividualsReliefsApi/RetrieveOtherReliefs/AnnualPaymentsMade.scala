/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class AnnualPaymentsMade(customerReference: Option[String], reliefClaimed: BigDecimal)

object AnnualPaymentsMade {
  implicit val format: OFormat[AnnualPaymentsMade] = Json.format[AnnualPaymentsMade]
}
