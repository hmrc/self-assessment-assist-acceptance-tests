/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class ReliefsClaimedV2(`type`: String, amountClaimed: BigDecimal, allowableAmount: BigDecimal, amountUsed: BigDecimal, rate: BigDecimal)

object ReliefsClaimedV2 {
  implicit val format: OFormat[ReliefsClaimedV2] = Json.format[ReliefsClaimedV2]
}
