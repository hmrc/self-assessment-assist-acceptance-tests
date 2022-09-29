/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.reliefs.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class UkProperty(amountClaimed: BigDecimal,
                      allowableAmount: BigDecimal,
                      carryForwardAmount: Option[BigDecimal])

object UkProperty {
  implicit val format: OFormat[UkProperty] = Json.format[UkProperty]
}
