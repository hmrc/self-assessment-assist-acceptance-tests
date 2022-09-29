/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.ukPropertyNonFhl.detail

import play.api.libs.json._

case class ResultOfClaimAppliedV2(claimId: String,
                                  originatingClaimId: String,
                                  taxYearClaimMade: String,
                                  claimType: String,
                                  mtdLoss: Boolean,
                                  taxYearLossIncurred: String,
                                  lossAmountUsed: BigInt,
                                  remainingLossValue: BigInt)

object ResultOfClaimAppliedV2 {
  implicit val format: OFormat[ResultOfClaimAppliedV2] = Json.format[ResultOfClaimAppliedV2]
}
