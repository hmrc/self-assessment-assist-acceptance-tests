/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveCharitableGivingReliefs

import play.api.libs.json.{Json, OFormat}

case class NonUkCharities(charityNames: Option[Seq[String]],
                          totalAmount: BigDecimal)

object NonUkCharities {
  implicit val format: OFormat[NonUkCharities] = Json.format[NonUkCharities]
}
