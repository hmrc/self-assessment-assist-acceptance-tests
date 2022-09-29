/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class PayrollGiving(customerReference: Option[String], reliefClaimed: BigDecimal)

object PayrollGiving {
  implicit val format: OFormat[PayrollGiving] = Json.format[PayrollGiving]
}
