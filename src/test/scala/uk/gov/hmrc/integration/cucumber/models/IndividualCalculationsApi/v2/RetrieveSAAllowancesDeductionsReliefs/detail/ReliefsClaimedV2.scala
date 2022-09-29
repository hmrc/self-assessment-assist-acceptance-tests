/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail

import play.api.libs.json.{Json, OFormat}

case class ReliefsClaimedV2(`type`: String,
                            amountClaimed: Option[BigDecimal],
                            allowableAmount: Option[BigDecimal],
                            amountUsed: Option[BigDecimal],
                            rate: Option[BigDecimal])

object ReliefsClaimedV2 {
  implicit val format: OFormat[ReliefsClaimedV2] = Json.format[ReliefsClaimedV2]
}
