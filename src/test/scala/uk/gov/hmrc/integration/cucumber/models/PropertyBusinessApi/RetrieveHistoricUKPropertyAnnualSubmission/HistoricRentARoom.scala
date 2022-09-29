/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveHistoricUKPropertyAnnualSubmission

import play.api.libs.json.{Format, Json}

case class HistoricRentARoom(jointlyLet: Boolean)

object HistoricRentARoom {
  implicit val format: Format[HistoricRentARoom] = Json.format
}