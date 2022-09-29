/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.lossesAndClaimsMandatory

import play.api.libs.json.{Json, OFormat}

case class ResultOfClaimsAppliedMandatory(claimId: String,
                                          originatingClaimId: String,
                                          incomeSourceId: String,
                                          incomeSourceType: String,
                                          taxYearClaimMade: String,
                                          claimType: String,
                                          mtdLoss: Boolean,
                                          taxYearLossIncurred: String,
                                          lossAmountUsed: BigInt,
                                          remainingLossValue: BigInt,
                                          lossType: String)

object ResultOfClaimsAppliedMandatory {
  implicit val format: OFormat[ResultOfClaimsAppliedMandatory] = Json.format[ResultOfClaimsAppliedMandatory]
}