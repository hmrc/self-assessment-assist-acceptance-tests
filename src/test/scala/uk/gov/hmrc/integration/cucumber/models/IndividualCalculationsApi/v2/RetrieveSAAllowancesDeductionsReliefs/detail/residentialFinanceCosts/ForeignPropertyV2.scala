/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAAllowancesDeductionsReliefs.detail.residentialFinanceCosts

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyV2(totalForeignPropertyAllowableAmount: BigDecimal, foreignPropertyRfcDetail: Seq[ForeignPropertyRfcDetailV2])

object ForeignPropertyV2 {
  implicit val format: OFormat[ForeignPropertyV2] = Json.format[ForeignPropertyV2]
}
