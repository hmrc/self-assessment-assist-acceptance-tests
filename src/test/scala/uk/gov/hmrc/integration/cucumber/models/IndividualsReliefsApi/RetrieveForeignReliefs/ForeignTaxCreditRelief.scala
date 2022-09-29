/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveForeignReliefs

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxCreditRelief(amount: BigDecimal)

object ForeignTaxCreditRelief {
  implicit val format: OFormat[ForeignTaxCreditRelief] = Json.format[ForeignTaxCreditRelief]
}
