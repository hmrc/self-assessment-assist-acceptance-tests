/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEAnnualSummary

import play.api.libs.json.{Format, Json}
import uk.gov.hmrc.integration.cucumber.models.Enums.Class4NicsExemptionReason

case class NonFinancials(businessDetailsChangedRecently: Boolean, class4NicsExemptionReason: Option[Class4NicsExemptionReason])

object NonFinancials {
  implicit val format: Format[NonFinancials] = Json.format[NonFinancials]
}
