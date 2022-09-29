/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class SharesAwardedOrReceivedItem(employerName: String,
                                       employerRef: Option[String],
                                       schemePlanType: String,
                                       dateSharesCeasedToBeSubjectToPlan: String,
                                       noOfShareSecuritiesAwarded: BigInt,
                                       classOfShareAwarded: String,
                                       dateSharesAwarded: String,
                                       sharesSubjectToRestrictions: Boolean,
                                       electionEnteredIgnoreRestrictions: Boolean,
                                       actualMarketValueOfSharesOnAward: BigDecimal,
                                       unrestrictedMarketValueOfSharesOnAward: BigDecimal,
                                       amountPaidForSharesOnAward: BigDecimal,
                                       marketValueAfterRestrictionsLifted: BigDecimal,
                                       taxableAmount: BigDecimal)

object SharesAwardedOrReceivedItem {
  implicit val format: OFormat[SharesAwardedOrReceivedItem] = Json.format[SharesAwardedOrReceivedItem]
}
