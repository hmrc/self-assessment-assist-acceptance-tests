/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class TopSlicingReliefMandatory(amount: BigDecimal)

object TopSlicingReliefMandatory {
  implicit val format: OFormat[TopSlicingReliefMandatory] = Json.format[TopSlicingReliefMandatory]
}