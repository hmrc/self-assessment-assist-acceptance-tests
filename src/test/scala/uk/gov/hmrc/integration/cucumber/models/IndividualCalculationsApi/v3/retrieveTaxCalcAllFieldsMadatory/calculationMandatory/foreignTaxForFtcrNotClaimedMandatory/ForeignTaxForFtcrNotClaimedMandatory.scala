/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.foreignTaxForFtcrNotClaimedMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignTaxForFtcrNotClaimedMandatory(foreignTaxOnForeignEmployment: BigDecimal)

object ForeignTaxForFtcrNotClaimedMandatory {
  implicit val format: OFormat[ForeignTaxForFtcrNotClaimedMandatory] = Json.format[ForeignTaxForFtcrNotClaimedMandatory]
}