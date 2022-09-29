/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}

case class SinglePropertyDisposals(source: String,
                                   submittedOn: String,
                                   ppdSubmissionId: String,
                                   ppdSubmissionDate: String,
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

object SinglePropertyDisposals {
  implicit val format: OFormat[SinglePropertyDisposals] = Json.format[SinglePropertyDisposals]
}
