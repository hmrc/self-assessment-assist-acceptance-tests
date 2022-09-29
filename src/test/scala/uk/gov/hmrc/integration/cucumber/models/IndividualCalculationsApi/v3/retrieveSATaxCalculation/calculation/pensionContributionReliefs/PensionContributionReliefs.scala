/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.pensionContributionReliefs

import play.api.libs.json.{Json, OFormat}

case class PensionContributionReliefs(totalPensionContributionReliefs: BigDecimal,
                                      pensionContributionDetail: PensionContributionDetail)

object PensionContributionReliefs {
  implicit val format: OFormat[PensionContributionReliefs] = Json.format[PensionContributionReliefs]
}