/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.allowancesAndDeductionsMandatory

import play.api.libs.json.{Json, OFormat}

case class AnnuityPaymentsMandatory(reliefClaimed: BigDecimal,
                                    rate: BigDecimal)

object AnnuityPaymentsMandatory {
  implicit val format: OFormat[AnnuityPaymentsMandatory] = Json.format[AnnuityPaymentsMandatory]
}