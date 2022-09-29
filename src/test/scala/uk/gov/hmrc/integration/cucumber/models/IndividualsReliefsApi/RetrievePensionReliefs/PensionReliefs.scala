/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrievePensionReliefs

import play.api.libs.json.{Json, OFormat}

case class PensionReliefs(regularPensionContributions: Option[BigDecimal],
                          oneOffPensionContributionsPaid: Option[BigDecimal],
                          retirementAnnuityPayments: Option[BigDecimal],
                          paymentToEmployersSchemeNoTaxRelief: Option[BigDecimal],
                          overseasPensionSchemeContributions: Option[BigDecimal])

object PensionReliefs {
  implicit val format: OFormat[PensionReliefs] = Json.format[PensionReliefs]
}
