/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json._

case class Class4NicDetailV2(class4Losses: Option[Class4LossesV2],
                             totalIncomeLiableToClass4Charge: Option[BigInt],
                             totalIncomeChargeableToClass4: Option[BigInt],
                             class4NicBands: Option[Seq[NicBandV2]])

object Class4NicDetailV2 {
  implicit val format: OFormat[Class4NicDetailV2] = Json.format[Class4NicDetailV2]
}
