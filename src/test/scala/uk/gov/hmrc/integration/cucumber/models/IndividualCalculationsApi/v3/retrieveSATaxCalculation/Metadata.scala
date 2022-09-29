/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation

import play.api.libs.json.{Json, OFormat}

case class Metadata(calculationId: String,
                    taxYear: String,
                    requestedBy: String,
                    requestedTimestamp: Option[String],
                    calculationReason: String,
                    calculationTimestamp: Option[String],
                    calculationType: String,
                    intentToSubmitFinalDeclaration: Boolean,
                    finalDeclaration: Boolean,
                    finalDeclarationTimestamp: Option[String],
                    periodFrom: String,
                    periodTo: String)

object Metadata {
  implicit val format: OFormat[Metadata] = Json.format[Metadata]
}