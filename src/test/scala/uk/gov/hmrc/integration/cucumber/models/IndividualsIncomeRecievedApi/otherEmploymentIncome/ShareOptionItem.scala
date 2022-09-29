/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class ShareOptionItem(employerName: String,
                           employerRef: Option[String],
                           schemePlanType: String,
                           dateOfOptionGrant: String,
                           dateOfEvent: String,
                           optionNotExercisedButConsiderationReceived: Boolean,
                           amountOfConsiderationReceived: BigDecimal,
                           noOfSharesAcquired: BigInt,
                           classOfSharesAcquired: String,
                           exercisePrice: BigDecimal,
                           amountPaidForOption: BigDecimal,
                           marketValueOfSharesOnExcise: BigDecimal,
                           profitOnOptionExercised: BigDecimal,
                           employersNicPaid: BigDecimal,
                           taxableAmount: BigDecimal)

object ShareOptionItem {
  implicit val format: OFormat[ShareOptionItem] = Json.format[ShareOptionItem]
}
