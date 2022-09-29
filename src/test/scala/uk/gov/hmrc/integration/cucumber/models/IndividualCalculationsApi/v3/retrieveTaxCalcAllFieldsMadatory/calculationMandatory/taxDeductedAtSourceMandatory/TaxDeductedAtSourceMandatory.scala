/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxDeductedAtSourceMandatory

import play.api.libs.json.{Json, OFormat}

case class TaxDeductedAtSourceMandatory(bbsi: BigDecimal,
                                        ukLandAndProperty: BigDecimal,
                                        cis: BigDecimal,
                                        securities: BigDecimal,
                                        voidedIsa: BigDecimal,
                                        payeEmployments: BigDecimal,
                                        occupationalPensions: BigDecimal,
                                        stateBenefits: BigDecimal,
                                        specialWithholdingTaxOrUkTaxPaid: BigDecimal,
                                        inYearAdjustmentCodedInLaterTaxYear: BigDecimal)

object TaxDeductedAtSourceMandatory {
  implicit val format: OFormat[TaxDeductedAtSourceMandatory] = Json.format[TaxDeductedAtSourceMandatory]
}