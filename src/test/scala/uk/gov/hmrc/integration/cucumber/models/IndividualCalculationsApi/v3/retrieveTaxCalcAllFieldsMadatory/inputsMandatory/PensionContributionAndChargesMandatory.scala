/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class PensionContributionAndChargesMandatory(`type`: String,
                                                  submissionTimestamp: String,
                                                  startDate: String,
                                                  endDate: String,
                                                  source: String)

object PensionContributionAndChargesMandatory {
  implicit val format: OFormat[PensionContributionAndChargesMandatory] = Json.format[PensionContributionAndChargesMandatory]
}