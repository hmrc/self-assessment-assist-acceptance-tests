/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.RetrieveUKPropertyAnnualSubmission

import play.api.libs.json.{Json, OFormat}

case class FirstYear(qualifyingDate: String, qualifyingAmountExpenditure: BigDecimal)

object FirstYear {
  implicit val format: OFormat[FirstYear] = Json.format[FirstYear]
}
