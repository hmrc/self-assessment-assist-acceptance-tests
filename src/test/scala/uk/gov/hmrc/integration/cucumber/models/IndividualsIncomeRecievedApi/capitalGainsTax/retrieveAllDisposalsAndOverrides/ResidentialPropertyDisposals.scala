/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}

case class ResidentialPropertyDisposals(customerReference: String,
                                        disposalDate: String,
                                        completionDate: String,
                                        disposalProceeds: BigDecimal,
                                        acquisitionDate: String,
                                        acquisitionAmount: BigDecimal,
                                        improvementCosts: BigDecimal,
                                        additionalCosts: BigDecimal,
                                        prfAmount: BigDecimal,
                                        otherReliefAmount: BigDecimal,
                                        lossesFromThisYear: BigDecimal,
                                        lossesFromPreviousYear: BigDecimal,
                                        amountOfNetGain: Option[BigDecimal],
                                        amountOfNetLoss: Option[BigDecimal])

object ResidentialPropertyDisposals {
  implicit val format: OFormat[ResidentialPropertyDisposals] = Json.format[ResidentialPropertyDisposals]
}
