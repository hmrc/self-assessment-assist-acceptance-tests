/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.listPayments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class ListPayments(payments: Seq[Payment], links: Seq[HateoasLink])

object ListPayments {
  implicit val format: OFormat[ListPayments] = Json.format[ListPayments]
}
