/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveSATaxCalculationMandatory(metadata: MetadataMandatory,
                                             inputs: InputsMandatory,
                                             calculation	: CalculationMandatory,
                                             messages: MessagesMandatory,
                                             links: Seq[HateoasLink])

object RetrieveSATaxCalculationMandatory {
  implicit val format: OFormat[RetrieveSATaxCalculationMandatory] = Json.format[RetrieveSATaxCalculationMandatory]
}