/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class MaintenancePayments(customerReference: String,
                               exSpouseName: Option[String],
                               exSpouseDateOfBirth: Option[String],
                               amount: Option[BigDecimal])

object MaintenancePayments {
  implicit val format: OFormat[MaintenancePayments] = Json.format[MaintenancePayments]
}
