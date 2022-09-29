/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.pensionContributionReliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionContributionDetailMandatory(regularPensionContributions: BigDecimal,
                                              oneOffPensionContributionsPaid: BigDecimal)

object PensionContributionDetailMandatory {
  implicit val format: OFormat[PensionContributionDetailMandatory] = Json.format[PensionContributionDetailMandatory]
}