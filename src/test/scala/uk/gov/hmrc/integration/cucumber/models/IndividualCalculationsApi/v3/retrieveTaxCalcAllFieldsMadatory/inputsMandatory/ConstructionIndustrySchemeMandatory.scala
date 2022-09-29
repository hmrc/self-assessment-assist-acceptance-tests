/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class ConstructionIndustrySchemeMandatory(employerRef: String,
                                               contractorName: String,
                                               periodData: Seq[PeriodDataMandatory])

object ConstructionIndustrySchemeMandatory {
  implicit val format: OFormat[ConstructionIndustrySchemeMandatory] = Json.format[ConstructionIndustrySchemeMandatory]
}