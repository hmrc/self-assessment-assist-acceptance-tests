/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2

import play.api.libs.json._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSAMessagesV2(info: Option[Seq[MessageV2]],
                                warnings: Option[Seq[MessageV2]],
                                errors: Option[Seq[MessageV2]],
                                links: Seq[HateoasLink]) {

  def hasMessages: Boolean = this match {
    case RetrieveSAMessagesV2(None, None, None, _) => false
    case _                                         => true
  }

}

object RetrieveSAMessagesV2 {
  implicit val formats: OFormat[RetrieveSAMessagesV2] = Json.format[RetrieveSAMessagesV2]
}
