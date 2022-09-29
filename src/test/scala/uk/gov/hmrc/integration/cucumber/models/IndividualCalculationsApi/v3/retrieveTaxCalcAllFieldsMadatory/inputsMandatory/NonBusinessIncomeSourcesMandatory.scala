/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class NonBusinessIncomeSourcesMandatory(incomeSourceId: String,
                                             incomeSourceType: String,
                                             incomeSourceName: String,
                                             startDate: String,
                                             endDate: String,
                                             source: String,
                                             periodId: String,
                                             latestReceivedDateTime: String)

object NonBusinessIncomeSourcesMandatory {
  implicit val format: OFormat[NonBusinessIncomeSourcesMandatory] = Json.format[NonBusinessIncomeSourcesMandatory]
}