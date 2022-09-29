/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V2.retrieveSelfAssessmentChargeHistory

import play.api.libs.json.{Json, OFormat}


case class RetrieveSelfAssessmentChargeHistoryResponse(chargeHistoryDetails: Seq[ChargeHistoryDetail])

object RetrieveSelfAssessmentChargeHistoryResponse {
  implicit val format: OFormat[RetrieveSelfAssessmentChargeHistoryResponse] = Json.format[RetrieveSelfAssessmentChargeHistoryResponse]
}