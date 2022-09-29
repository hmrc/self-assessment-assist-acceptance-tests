/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveAllDisposalsAndOverrides(ppdService: PpdService, customerAddedDisposals: Option[CustomerAddedDisposals], links: Seq[HateoasLink])

object RetrieveAllDisposalsAndOverrides {
  implicit val format: OFormat[RetrieveAllDisposalsAndOverrides] = Json.format[RetrieveAllDisposalsAndOverrides]
}
