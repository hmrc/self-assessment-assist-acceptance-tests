/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listCharges

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Charge(taxYear: String,
                  transactionId: String,
                  transactionDate: String,
                  `type`: Option[String],
                  totalAmount: BigDecimal,
                  outstandingAmount: BigDecimal,
                  links: Seq[HateoasLink])

object Charge {
  implicit val format: OFormat[Charge] = Json.format[Charge]
}
