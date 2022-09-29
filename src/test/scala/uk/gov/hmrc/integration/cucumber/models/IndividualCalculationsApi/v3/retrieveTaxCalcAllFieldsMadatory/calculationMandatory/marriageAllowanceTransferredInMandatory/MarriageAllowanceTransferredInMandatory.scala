/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.marriageAllowanceTransferredInMandatory

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferredInMandatory(amount: BigDecimal,
                                                   rate: BigDecimal)

object MarriageAllowanceTransferredInMandatory {
  implicit val format: OFormat[MarriageAllowanceTransferredInMandatory] = Json.format[MarriageAllowanceTransferredInMandatory]
}