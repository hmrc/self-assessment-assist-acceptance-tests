/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualLossesApi.v3.BroughtForwardLosses

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class LossObject(lossId: String,
                      businessId: String,
                      typeOfLoss: String,
                      lossAmount: BigDecimal,
                      taxYearBroughtForwardFrom: String,
                      lastModified: String,
                      links: Seq[HateoasLink])

object LossObject {
  implicit val format: OFormat[LossObject] = Json.format[LossObject]
}
