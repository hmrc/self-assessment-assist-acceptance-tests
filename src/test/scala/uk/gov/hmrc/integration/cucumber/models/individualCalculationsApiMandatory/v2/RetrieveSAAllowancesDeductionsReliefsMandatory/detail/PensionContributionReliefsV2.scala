/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class PensionContributionReliefsV2(totalPensionContributionReliefs: BigDecimal,
                                        regularPensionContributions: BigDecimal,
                                        oneOffPensionContributionsPaid: BigDecimal)

object PensionContributionReliefsV2 {
  implicit val format: OFormat[PensionContributionReliefsV2] = Json.format[PensionContributionReliefsV2]
}
