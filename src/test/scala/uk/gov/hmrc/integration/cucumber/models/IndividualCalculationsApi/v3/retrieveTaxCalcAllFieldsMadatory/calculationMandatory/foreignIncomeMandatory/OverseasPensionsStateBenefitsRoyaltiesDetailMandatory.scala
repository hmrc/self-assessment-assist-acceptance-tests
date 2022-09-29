/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionsStateBenefitsRoyaltiesDetailMandatory(countryCode: String,
                                                                 grossIncome: BigDecimal,
                                                                 netIncome: BigDecimal,
                                                                 taxDeducted: BigDecimal,
                                                                 foreignTaxCreditRelief: Boolean)

object OverseasPensionsStateBenefitsRoyaltiesDetailMandatory {
  implicit val format: OFormat[OverseasPensionsStateBenefitsRoyaltiesDetailMandatory] = Json.format[OverseasPensionsStateBenefitsRoyaltiesDetailMandatory]
}