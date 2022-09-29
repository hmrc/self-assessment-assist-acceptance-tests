/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveForeignReliefs

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxForFtcrNotClaimed(amount: BigDecimal)

object ForeignTaxForFtcrNotClaimed {
  implicit val format: OFormat[ForeignTaxForFtcrNotClaimed] = Json.format[ForeignTaxForFtcrNotClaimed]
}
