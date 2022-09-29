/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.codedOutUnderpaymentsMandatory

import play.api.libs.json.{Json, OFormat}

case class PayeUnderpaymentsDetailMandatory(amount: BigDecimal,
                                            relatedTaxYear: String,
                                            source: String)

object PayeUnderpaymentsDetailMandatory {
  implicit val format: OFormat[PayeUnderpaymentsDetailMandatory] = Json.format[PayeUnderpaymentsDetailMandatory]
}