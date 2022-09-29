/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class ForeignProperty(totalForeignPropertyAllowableAmount: BigDecimal,
                           foreignPropertyRfcDetail: Seq[ForeignPropertyRfcDetail])

object ForeignProperty {
  implicit val format: OFormat[ForeignProperty] = Json.format[ForeignProperty]
}
