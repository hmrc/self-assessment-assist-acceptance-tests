/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class IncomeSourcesMandatory(businessIncomeSources: Seq[BusinessIncomeSourcesMandatory],
                                  nonBusinessIncomeSources: Seq[NonBusinessIncomeSourcesMandatory])

object IncomeSourcesMandatory {
  implicit val format: OFormat[IncomeSourcesMandatory] = Json.format[IncomeSourcesMandatory]
}