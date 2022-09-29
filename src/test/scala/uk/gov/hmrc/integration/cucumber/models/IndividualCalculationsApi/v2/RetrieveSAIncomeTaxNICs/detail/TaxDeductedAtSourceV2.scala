/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class TaxDeductedAtSourceV2(ukLandAndProperty: Option[BigDecimal],
                                 savings: Option[BigDecimal],
                                 cis: Option[BigDecimal],
                                 securities: Option[BigDecimal],
                                 voidedIsa: Option[BigDecimal],
                                 payeEmployments: Option[BigDecimal],
                                 occupationalPensions: Option[BigDecimal],
                                 stateBenefits: Option[BigDecimal],
                                 specialWithholdingTaxOrUkTaxPaid: Option[BigDecimal],
                                 inYearAdjustmentCodedInLaterTaxYear: Option[BigDecimal])

object TaxDeductedAtSourceV2 {
  implicit val format: OFormat[TaxDeductedAtSourceV2] = Json.format[TaxDeductedAtSourceV2]
}
