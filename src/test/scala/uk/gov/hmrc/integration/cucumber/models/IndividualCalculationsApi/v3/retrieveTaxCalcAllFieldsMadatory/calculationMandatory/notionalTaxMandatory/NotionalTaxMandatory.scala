/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.notionalTaxMandatory

import play.api.libs.json.{Json, OFormat}

case class NotionalTaxMandatory(chargeableGains: BigDecimal)

object NotionalTaxMandatory {
  implicit val format: OFormat[NotionalTaxMandatory] = Json.format[NotionalTaxMandatory]
}