/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionContributionReliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionContributionReliefsMandatory(totalPensionContributionReliefs: BigDecimal,
                                               pensionContributionDetail: PensionContributionDetailMandatory)

object PensionContributionReliefsMandatory {
  implicit val format: OFormat[PensionContributionReliefsMandatory] = Json.format[PensionContributionReliefsMandatory]
}