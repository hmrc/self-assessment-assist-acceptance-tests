/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveCharitableGivingReliefs

import play.api.libs.json.{Json, OFormat}

case class Gifts(nonUkCharities: Option[NonUkCharities],
                 landAndBuildings: Option[BigDecimal],
                 sharesOrSecurities: Option[BigDecimal])

object Gifts {
  implicit val format: OFormat[Gifts] = Json.format[Gifts]
}
