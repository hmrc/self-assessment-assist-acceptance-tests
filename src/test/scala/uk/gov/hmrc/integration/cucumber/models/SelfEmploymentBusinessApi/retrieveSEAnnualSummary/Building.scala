/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary

import play.api.libs.json.{Format, Json}

case class Building(name: Option[String], number: Option[String], postcode: String)

object Building {
  implicit val format: Format[Building] = Json.format[Building]
}
