/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges

import play.api.libs.json.{Json, OFormat}

case class PensionBandsV2(name: String,
                          rate: BigDecimal,
                          bandLimit: BigInt,
                          apportionedBandLimit: BigInt,
                          contributionAmount: BigDecimal,
                          pensionCharge: BigDecimal)

object PensionBandsV2 {
  implicit val format: OFormat[PensionBandsV2] = Json.format[PensionBandsV2]
}
