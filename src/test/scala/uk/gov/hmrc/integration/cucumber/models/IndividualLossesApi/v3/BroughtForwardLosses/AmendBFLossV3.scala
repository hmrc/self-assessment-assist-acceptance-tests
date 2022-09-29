/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.BroughtForwardLosses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class AmendBFLossV3(businessId: String,
                         typeOfLoss: String,
                         lossAmount: BigDecimal,
                         taxYearBroughtForwardFrom: String,
                         lastModified: String,
                         links: Seq[HateoasLink])

object AmendBFLossV3 {
  implicit val writes: OFormat[AmendBFLossV3] = Json.format[AmendBFLossV3]

}
