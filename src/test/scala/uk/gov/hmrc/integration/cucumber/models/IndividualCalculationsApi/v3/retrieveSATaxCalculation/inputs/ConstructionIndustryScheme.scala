/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.inputs

import play.api.libs.json.{Json, OFormat}

case class ConstructionIndustryScheme(employerRef: String,
                                      contractorName: Option[String],
                                      periodData: Seq[PeriodData])

object ConstructionIndustryScheme {
  implicit val format: OFormat[ConstructionIndustryScheme] = Json.format[ConstructionIndustryScheme]
}