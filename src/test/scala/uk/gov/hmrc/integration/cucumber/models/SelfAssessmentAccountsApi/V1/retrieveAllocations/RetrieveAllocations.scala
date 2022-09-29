/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveAllocations

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveAllocations(amount: Option[BigDecimal],
                               method: Option[String],
                               transactionDate: Option[String],
                               allocations: Seq[AllocationDetail],
                               links: Option[Seq[HateoasLink]])

object RetrieveAllocations {
  implicit val format: OFormat[RetrieveAllocations] = Json.format[RetrieveAllocations]
}
