/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class PensionContributionReliefsV2(totalPensionContributionReliefs: BigDecimal,
                                        regularPensionContributions: Option[BigDecimal],
                                        oneOffPensionContributionsPaid: Option[BigDecimal])

object PensionContributionReliefsV2 {
  implicit val format: OFormat[PensionContributionReliefsV2] = Json.format[PensionContributionReliefsV2]
}
