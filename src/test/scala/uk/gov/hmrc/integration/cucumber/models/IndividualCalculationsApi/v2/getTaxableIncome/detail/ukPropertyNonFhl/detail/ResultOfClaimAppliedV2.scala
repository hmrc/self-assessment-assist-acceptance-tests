/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.getTaxableIncome.detail.ukPropertyNonFhl.detail

import play.api.libs.json._

case class ResultOfClaimAppliedV2(claimId: Option[String],
                                  originatingClaimId: Option[String],
                                  taxYearClaimMade: String,
                                  claimType: String,
                                  mtdLoss: Boolean,
                                  taxYearLossIncurred: String,
                                  lossAmountUsed: BigInt,
                                  remainingLossValue: BigInt)

object ResultOfClaimAppliedV2 {
  implicit val formats: OFormat[ResultOfClaimAppliedV2] = Json.format[ResultOfClaimAppliedV2]
}
