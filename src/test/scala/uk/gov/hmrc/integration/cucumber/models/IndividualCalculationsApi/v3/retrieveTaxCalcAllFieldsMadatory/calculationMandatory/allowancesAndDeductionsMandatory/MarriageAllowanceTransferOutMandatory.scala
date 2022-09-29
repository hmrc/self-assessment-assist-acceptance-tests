/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.allowancesAndDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class MarriageAllowanceTransferOutMandatory(personalAllowanceBeforeTransferOut: BigDecimal,
                                                 transferredOutAmount: BigDecimal)

object MarriageAllowanceTransferOutMandatory {
  implicit val format: OFormat[MarriageAllowanceTransferOutMandatory] = Json.format[MarriageAllowanceTransferOutMandatory]
}