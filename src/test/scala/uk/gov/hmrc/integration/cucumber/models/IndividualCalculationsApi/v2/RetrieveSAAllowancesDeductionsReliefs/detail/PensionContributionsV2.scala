/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsV2(totalPensionContributions: Option[BigDecimal],
                                  retirementAnnuityPayments: Option[BigDecimal],
                                  paymentToEmployersSchemeNoTaxRelief: Option[BigDecimal],
                                  overseasPensionSchemeContributions: Option[BigDecimal])

object PensionContributionsV2 {
  implicit val format: OFormat[PensionContributionsV2] = Json.format[PensionContributionsV2]
}
