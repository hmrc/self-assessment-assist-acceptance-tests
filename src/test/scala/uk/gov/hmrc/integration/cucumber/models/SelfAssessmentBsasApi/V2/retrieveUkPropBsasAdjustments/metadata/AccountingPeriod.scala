/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveUkPropBsasAdjustments.metadata

import java.time.LocalDate
import play.api.libs.json.{Json, OFormat}

case class AccountingPeriod(startDate: LocalDate, endDate: LocalDate)

object AccountingPeriod {
  implicit val format: OFormat[AccountingPeriod] = Json.format[AccountingPeriod]
}
