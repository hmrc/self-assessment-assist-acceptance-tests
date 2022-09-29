/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.lossesAndClaims

import play.api.libs.json.{Json, OFormat}

case class ResultOfClaimsApplied(claimId: Option[String],
                                 originatingClaimId: Option[String],
                                 incomeSourceId: String,
                                 incomeSourceType: String,
                                 taxYearClaimMade: String,
                                 claimType: String,
                                 mtdLoss: Option[Boolean],
                                 taxYearLossIncurred: String,
                                 lossAmountUsed: BigInt,
                                 remainingLossValue: BigInt,
                                 lossType: Option[String])

object ResultOfClaimsApplied {
  implicit val format: OFormat[ResultOfClaimsApplied] = Json.format[ResultOfClaimsApplied]
}