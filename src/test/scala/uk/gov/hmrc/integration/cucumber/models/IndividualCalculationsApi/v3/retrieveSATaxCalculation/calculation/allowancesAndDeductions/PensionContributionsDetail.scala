/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.allowancesAndDeductions

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsDetail(retirementAnnuityPayments: Option[BigDecimal],
                                      paymentToEmployersSchemeNoTaxRelief: Option[BigDecimal],
                                      overseasPensionSchemeContributions: Option[BigDecimal])

object PensionContributionsDetail {
  implicit val format: OFormat[PensionContributionsDetail] = Json.format[PensionContributionsDetail]
}