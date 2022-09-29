/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Obligations

import play.api.libs.json.{Json, OFormat}

case class Obligation(periodStartDate: String, periodEndDate: String, dueDate: String, status: String, receivedDate: Option[String])

object Obligation {
  implicit val format: OFormat[Obligation] = Json.format[Obligation]
}
