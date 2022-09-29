/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class PeriodDataMandatory(deductionFromDate: String,
                               deductionToDate: String,
                               submissionTimestamp: String,
                               source: String,
                               deductionAmount: BigDecimal)

object PeriodDataMandatory {
  implicit val format: OFormat[PeriodDataMandatory] = Json.format[PeriodDataMandatory]
}