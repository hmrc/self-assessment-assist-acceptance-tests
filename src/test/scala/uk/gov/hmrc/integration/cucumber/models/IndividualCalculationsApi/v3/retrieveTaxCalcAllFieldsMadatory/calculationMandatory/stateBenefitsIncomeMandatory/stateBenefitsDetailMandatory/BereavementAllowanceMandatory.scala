/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.stateBenefitsIncomeMandatory.stateBenefitsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class BereavementAllowanceMandatory(incomeSourceId: String,
                                         amount: BigDecimal,
                                         source: String)

object BereavementAllowanceMandatory {
  implicit val format: OFormat[BereavementAllowanceMandatory] = Json.format[BereavementAllowanceMandatory]
}