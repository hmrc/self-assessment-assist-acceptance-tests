/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}

case class MultiplePropertyDisposals(source: String,
                                     submittedOn: String,
                                     ppdSubmissionId: String,
                                     ppdSubmissionDate: String,
                                     numberOfDisposals: BigInt,
                                     disposalTaxYear: BigInt,
                                     completionDate: String,
                                     amountOfNetGain: Option[BigDecimal],
                                     amountOfNetLoss: Option[BigDecimal])

object MultiplePropertyDisposals {
  implicit val format: OFormat[MultiplePropertyDisposals] = Json.format[MultiplePropertyDisposals]
}
