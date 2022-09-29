/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._

case class ResultOfClaimAppliedV2(claimId: String,
                                  taxYearClaimMade: String,
                                  claimType: String,
                                  mtdLoss: Boolean,
                                  taxYearLossIncurred: String,
                                  lossAmountUsed: BigInt,
                                  remainingLossValue: BigInt,
                                  lossType: String)

object ResultOfClaimAppliedV2 {
  implicit val format: OFormat[ResultOfClaimAppliedV2] = Json.format[ResultOfClaimAppliedV2]
}
