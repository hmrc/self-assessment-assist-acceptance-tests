/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class JobSeekersAllowanceMandatory(incomeSourceId: String,
                                        amount: BigDecimal,
                                        taxPaid: BigDecimal,
                                        source: String)

object JobSeekersAllowanceMandatory {
  implicit val format: OFormat[JobSeekersAllowanceMandatory] = Json.format[JobSeekersAllowanceMandatory]
}