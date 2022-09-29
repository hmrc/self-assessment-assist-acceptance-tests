/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.inputsMandatory

import play.api.libs.json.{Json, OFormat}

case class AllowancesReliefsAndDeductionsMandatory(`type`: String,
                                                   submittedTimestamp: String,
                                                   startDate: String,
                                                   endDate: String,
                                                   source: String)

object AllowancesReliefsAndDeductionsMandatory {
  implicit val format: OFormat[AllowancesReliefsAndDeductionsMandatory] = Json.format[AllowancesReliefsAndDeductionsMandatory]
}