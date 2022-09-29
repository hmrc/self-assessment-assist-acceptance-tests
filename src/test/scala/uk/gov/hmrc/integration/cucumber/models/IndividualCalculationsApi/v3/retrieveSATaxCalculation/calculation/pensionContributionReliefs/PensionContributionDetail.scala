/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionContributionReliefs

import play.api.libs.json.{Json, OFormat}

case class PensionContributionDetail(regularPensionContributions: Option[BigDecimal],
                                     oneOffPensionContributionsPaid: Option[BigDecimal])

object PensionContributionDetail {
  implicit val format: OFormat[PensionContributionDetail] = Json.format[PensionContributionDetail]
}