/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.foreignTaxForFtcrNotClaimed

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxForFtcrNotClaimed(foreignTaxOnForeignEmployment: Option[BigDecimal])

object ForeignTaxForFtcrNotClaimed {
  implicit val format: OFormat[ForeignTaxForFtcrNotClaimed] = Json.format[ForeignTaxForFtcrNotClaimed]
}