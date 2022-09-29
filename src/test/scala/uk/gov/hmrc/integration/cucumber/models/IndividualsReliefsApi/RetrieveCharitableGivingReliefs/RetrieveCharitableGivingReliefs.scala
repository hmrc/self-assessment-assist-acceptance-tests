/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveCharitableGivingReliefs

import play.api.libs.json.{Json, OFormat}

case class RetrieveCharitableGivingReliefs(giftAidPayments: Option[GiftAidPayments], gifts: Option[Gifts])

object RetrieveCharitableGivingReliefs {
  implicit val format: OFormat[RetrieveCharitableGivingReliefs] = Json.format[RetrieveCharitableGivingReliefs]
}
