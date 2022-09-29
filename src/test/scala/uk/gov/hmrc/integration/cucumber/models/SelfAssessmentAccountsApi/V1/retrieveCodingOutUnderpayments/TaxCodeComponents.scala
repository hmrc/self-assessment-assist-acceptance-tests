/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentAccountsApi.V1.retrieveCodingOutUnderpayments

import play.api.libs.json.{Json, OFormat}

case class TaxCodeComponents(id: BigInt, amount: BigDecimal, relatedTaxYear: String, submittedOn: String, source: String)

object TaxCodeComponents {
  implicit val format: OFormat[TaxCodeComponents] = Json.format[TaxCodeComponents]
}
