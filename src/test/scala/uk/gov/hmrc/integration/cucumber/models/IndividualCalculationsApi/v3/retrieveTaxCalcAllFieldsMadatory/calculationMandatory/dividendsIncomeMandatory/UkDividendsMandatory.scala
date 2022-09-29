/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class UkDividendsMandatory(incomeSourceId: String,
                                incomeSourceType: String,
                                dividends: BigInt,
                                otherUkDividends: BigInt)

object UkDividendsMandatory {
  implicit val format: OFormat[UkDividendsMandatory] = Json.format[UkDividendsMandatory]
}