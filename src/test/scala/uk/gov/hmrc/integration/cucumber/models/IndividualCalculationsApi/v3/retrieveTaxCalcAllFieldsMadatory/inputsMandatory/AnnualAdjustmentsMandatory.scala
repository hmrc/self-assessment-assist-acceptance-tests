/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class AnnualAdjustmentsMandatory(incomeSourceId: String,
                                      incomeSourceType: String,
                                      bsasId: String,
                                      receivedDateTime: String,
                                      applied: Boolean)

object AnnualAdjustmentsMandatory {
  implicit val format: OFormat[AnnualAdjustmentsMandatory] = Json.format[AnnualAdjustmentsMandatory]
}