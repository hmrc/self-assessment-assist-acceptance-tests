/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class TaxDeductedAtSourceV2(ukLandAndProperty: BigDecimal,
                                 savings: BigDecimal,
                                 cis: BigDecimal,
                                 securities: BigDecimal,
                                 voidedIsa: BigDecimal,
                                 payeEmployments: BigDecimal,
                                 occupationalPensions: BigDecimal,
                                 stateBenefits: BigDecimal,
                                 specialWithholdingTaxOrUkTaxPaid: BigDecimal,
                                 inYearAdjustmentCodedInLaterTaxYear: BigDecimal)

object TaxDeductedAtSourceV2 {
  implicit val format: OFormat[TaxDeductedAtSourceV2] = Json.format[TaxDeductedAtSourceV2]
}
