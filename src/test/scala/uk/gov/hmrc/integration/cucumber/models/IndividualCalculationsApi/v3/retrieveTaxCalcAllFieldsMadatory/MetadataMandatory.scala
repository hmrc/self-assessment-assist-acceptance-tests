/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory

import play.api.libs.json.{Json, OFormat}

case class MetadataMandatory(calculationId: String,
                             taxYear: String,
                             requestedBy: String,
                             requestedTimestamp: String,
                             calculationReason: String,
                             calculationTimestamp: String,
                             calculationType: String,
                             intentToSubmitFinalDeclaration: Boolean,
                             finalDeclaration: Boolean,
                             finalDeclarationTimestamp: String,
                             periodFrom: String,
                             periodTo: String)

object MetadataMandatory {
  implicit val format: OFormat[MetadataMandatory] = Json.format[MetadataMandatory]
}