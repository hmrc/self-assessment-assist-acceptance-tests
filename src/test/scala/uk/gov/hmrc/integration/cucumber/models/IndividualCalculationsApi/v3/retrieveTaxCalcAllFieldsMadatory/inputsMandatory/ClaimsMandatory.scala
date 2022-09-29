/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class ClaimsMandatory(claimId: String,
                           originatingClaimId: String,
                           incomeSourceId: String,
                           incomeSourceType: String,
                           submissionTimestamp: String,
                           taxYearClaimMade: String,
                           claimType: String,
                           sequence: BigInt)

object ClaimsMandatory {
  implicit val format: OFormat[ClaimsMandatory] = Json.format[ClaimsMandatory]
}