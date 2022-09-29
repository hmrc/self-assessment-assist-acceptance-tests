/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.CisDeductionsApi

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class CreateCisDeduction(submissionId: String, links: Seq[HateoasLink])

object CreateCisDeduction {
  implicit val writes: OFormat[CreateCisDeduction] = Json.format[CreateCisDeduction]
}
