/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Enums.{CalculationType, Request}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink


case class Calculations(calculationId: String,
                        calculationTimestamp: String,
                        calculationType: CalculationType,
                        requestedBy: Option[Request],
                        taxYear: Option[String],
                        totalIncomeTaxAndNicsDue: BigDecimal,
                        intentToSubmitFinalDeclaration: Option[Boolean],
                        finalDeclaration: Option[Boolean],
                        finalDeclarationTimestamp: Option[String],
                        links: Seq[HateoasLink])

object Calculations {
  implicit val format: OFormat[Calculations] = Json.format[Calculations]
}