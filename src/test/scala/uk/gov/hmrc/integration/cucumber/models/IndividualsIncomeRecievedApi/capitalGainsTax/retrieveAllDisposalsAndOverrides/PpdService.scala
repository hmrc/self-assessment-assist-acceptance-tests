/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax.retrieveAllDisposalsAndOverrides

import play.api.libs.json.{Json, OFormat}

case class PpdService(ppdYearToDate: Option[BigDecimal],
                      multiplePropertyDisposals: Seq[MultiplePropertyDisposals],
                      singlePropertyDisposals: Seq[SinglePropertyDisposals])

object PpdService {
  implicit val format: OFormat[PpdService] = Json.format[PpdService]
}
