/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}

case class CustomerAddedDisposals(submittedOn: String, disposals: Seq[ResidentialPropertyDisposals])

object CustomerAddedDisposals {
  implicit val format: OFormat[CustomerAddedDisposals] = Json.format[CustomerAddedDisposals]
}
