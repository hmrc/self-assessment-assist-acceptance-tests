/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsStateBenefitsApi.listBenefits

import play.api.libs.json._

case class ListBenefits(stateBenefits: Option[Seq[StateBenefit]], customerAddedStateBenefits: Option[Seq[StateBenefit]])

object ListBenefits {

  implicit val formatListBenefitResponse: OFormat[ListBenefits] = Json.format[ListBenefits]
}
