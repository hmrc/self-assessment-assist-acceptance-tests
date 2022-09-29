/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listPayments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class Payment(paymentId: Option[String],
                   amount: Option[BigDecimal],
                   method: Option[String],
                   transactionDate: Option[String],
                   links: Seq[HateoasLink])

object Payment {
  implicit val format: OFormat[Payment] = Json.format[Payment]
}
