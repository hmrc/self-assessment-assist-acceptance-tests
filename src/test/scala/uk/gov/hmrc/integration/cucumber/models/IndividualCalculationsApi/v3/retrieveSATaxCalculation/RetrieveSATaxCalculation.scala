/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSATaxCalculation(metadata: Metadata,
                                    inputs: Inputs,
                                    calculation	: Option[Calculation],
                                    messages: Option[Messages],
                                    links: Option[Seq[HateoasLink]])

object RetrieveSATaxCalculation {
  implicit val format: OFormat[RetrieveSATaxCalculation] = Json.format[RetrieveSATaxCalculation]
}