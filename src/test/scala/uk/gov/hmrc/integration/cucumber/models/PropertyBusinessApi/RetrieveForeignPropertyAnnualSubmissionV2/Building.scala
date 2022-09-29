/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveForeignPropertyAnnualSubmissionV2

import play.api.libs.json.{Json, OFormat}

case class Building(name: Option[String], number: Option[BigDecimal], postcode: String)

object Building {
  implicit val format: OFormat[Building] = Json.format[Building]
}
