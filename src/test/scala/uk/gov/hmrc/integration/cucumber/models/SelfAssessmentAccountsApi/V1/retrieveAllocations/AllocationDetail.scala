/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveAllocations

import play.api.libs.json.{Json, OFormat}

case class AllocationDetail(transactionId: Option[String],
                            from: Option[String],
                            to: Option[String],
                            `type`: Option[String],
                            amount: Option[BigDecimal],
                            clearedAmount: Option[BigDecimal])

object AllocationDetail {
  implicit val format: OFormat[AllocationDetail] = Json.format[AllocationDetail]
}
