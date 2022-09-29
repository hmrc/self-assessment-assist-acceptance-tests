/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.RetrieveBusinessDetails

import play.api.libs.json.{Json, OFormat}

case class AccountingPeriod(start: String, end: String)

object AccountingPeriod {
  implicit val format: OFormat[AccountingPeriod] = Json.format[AccountingPeriod]
}
