/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}

case class PostCessationTradeReliefAndCertainOtherLosses(customerReference: String,
                                                         businessName: Option[String],
                                                         dateBusinessCeased: Option[String],
                                                         natureOfTrade: Option[String],
                                                         incomeSource: Option[String],
                                                         amount: Option[BigDecimal])

object PostCessationTradeReliefAndCertainOtherLosses {
  implicit val format: OFormat[PostCessationTradeReliefAndCertainOtherLosses] = Json.format[PostCessationTradeReliefAndCertainOtherLosses]
}
