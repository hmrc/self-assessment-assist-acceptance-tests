/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveOtherDisposalsAndGains(submittedOn: String,
                                          disposals: Option[Seq[Disposals]],
                                          nonStandardGains: Option[NonStandardGains],
                                          losses: Option[Losses],
                                          adjustments: Option[BigDecimal],
                                          links: Option[Seq[HateoasLink]])

object RetrieveOtherDisposalsAndGains {
  implicit val format: OFormat[RetrieveOtherDisposalsAndGains] = Json.format[RetrieveOtherDisposalsAndGains]
}
