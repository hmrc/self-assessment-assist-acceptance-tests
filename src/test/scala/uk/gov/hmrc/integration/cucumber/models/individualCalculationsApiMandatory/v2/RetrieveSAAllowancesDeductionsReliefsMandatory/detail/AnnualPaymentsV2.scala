/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class AnnualPaymentsV2(grossAnnualPayments: BigDecimal, reliefClaimed: BigDecimal, rate: BigDecimal)

object AnnualPaymentsV2 {
  implicit val format: OFormat[AnnualPaymentsV2] = Json.format[AnnualPaymentsV2]
}
