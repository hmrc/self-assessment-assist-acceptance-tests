/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentApi.MtdSavingsAccounts

import play.api.libs.json.{Json, OFormat}

case class AddSavingsAccountResponse(id: String)

object AddSavingsAccountResponse {
  implicit val writes: OFormat[AddSavingsAccountResponse] = Json.format[AddSavingsAccountResponse]

  def validResponse: AddSavingsAccountResponse = AddSavingsAccountResponse(
    id = ""
  )

}
