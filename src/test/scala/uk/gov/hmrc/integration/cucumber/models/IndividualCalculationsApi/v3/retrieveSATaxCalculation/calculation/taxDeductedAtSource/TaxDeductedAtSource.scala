/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxDeductedAtSource

import play.api.libs.json.{Json, OFormat}

case class TaxDeductedAtSource(bbsi: Option[BigDecimal],
                               ukLandAndProperty: Option[BigDecimal],
                               cis: Option[BigDecimal],
                               securities: Option[BigDecimal],
                               voidedIsa: Option[BigDecimal],
                               payeEmployments: Option[BigDecimal],
                               occupationalPensions: Option[BigDecimal],
                               stateBenefits: Option[BigDecimal],
                               specialWithholdingTaxOrUkTaxPaid: Option[BigDecimal],
                               inYearAdjustmentCodedInLaterTaxYear: Option[BigDecimal])

object TaxDeductedAtSource {
  implicit val format: OFormat[TaxDeductedAtSource] = Json.format[TaxDeductedAtSource]
}