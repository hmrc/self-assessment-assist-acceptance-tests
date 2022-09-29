/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveBalance

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveBalance(overdueAmount: BigDecimal,
                           payableAmount: BigDecimal,
                           payableDueDate: Option[String],
                           pendingChargeDueAmount: BigDecimal,
                           pendingChargeDueDate: Option[String],
                           totalBalance: BigDecimal,
                           links: Seq[HateoasLink])

object RetrieveBalance {
  implicit val format: OFormat[RetrieveBalance] = Json.format[RetrieveBalance]
}
