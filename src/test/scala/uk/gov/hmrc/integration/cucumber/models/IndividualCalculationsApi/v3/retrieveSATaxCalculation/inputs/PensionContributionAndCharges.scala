/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class PensionContributionAndCharges(`type`: String,
                                         submissionTimestamp: Option[String],
                                         startDate: Option[String],
                                         endDate: Option[String],
                                         source: Option[String])

object PensionContributionAndCharges {
  implicit val format: OFormat[PensionContributionAndCharges] = Json.format[PensionContributionAndCharges]
}