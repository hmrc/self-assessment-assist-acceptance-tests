/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class OtherEmploymentIncome(submittedOn: StatefulFieldWrapper[String],
                                 shareOption: Option[Seq[ShareOptionItem]],
                                 sharesAwardedOrReceived: Option[Seq[SharesAwardedOrReceivedItem]],
                                 disability: Option[Disability],
                                 foreignService: Option[ForeignService],
                                 lumpSums: Option[Seq[LumpSums]],
                                 links: Seq[HateoasLink])

object OtherEmploymentIncome {
  implicit val format: OFormat[OtherEmploymentIncome] = Json.format[OtherEmploymentIncome]
}
