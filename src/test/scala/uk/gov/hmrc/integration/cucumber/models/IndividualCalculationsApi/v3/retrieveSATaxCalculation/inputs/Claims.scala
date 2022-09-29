/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class Claims(claimId: Option[String],
                  originatingClaimId: Option[String],
                  incomeSourceId: String,
                  incomeSourceType: String,
                  submissionTimestamp: Option[String],
                  taxYearClaimMade: String,
                  claimType: String,
                  sequence: Option[BigInt])

object Claims {
  implicit val format: OFormat[Claims] = Json.format[Claims]
}