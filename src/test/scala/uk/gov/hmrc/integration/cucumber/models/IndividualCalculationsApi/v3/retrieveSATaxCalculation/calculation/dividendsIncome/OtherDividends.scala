/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.dividendsIncome

import play.api.libs.json.{Json, OFormat}

case class OtherDividends(typeOfDividend: Option[String],
                          customerReference: Option[String],
                          grossAmount: Option[BigDecimal])

object OtherDividends {
  implicit val format: OFormat[OtherDividends] = Json.format[OtherDividends]
}