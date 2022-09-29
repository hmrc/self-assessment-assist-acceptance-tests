/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class UkPropertyV2(amountClaimed: BigDecimal, allowableAmount: BigDecimal, carryForwardAmount: BigDecimal)

object UkPropertyV2 {
  implicit val format: OFormat[UkPropertyV2] = Json.format[UkPropertyV2]
}
