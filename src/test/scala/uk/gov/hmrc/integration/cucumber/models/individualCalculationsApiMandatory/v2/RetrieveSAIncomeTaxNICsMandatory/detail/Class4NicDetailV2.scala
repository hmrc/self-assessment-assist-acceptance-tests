/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json._

case class Class4NicDetailV2(class4Losses: Class4LossesV2,
                             totalIncomeLiableToClass4Charge: BigInt,
                             totalIncomeChargeableToClass4: BigInt,
                             class4NicBands: Seq[NicBandV2])

object Class4NicDetailV2 {
  implicit val format: OFormat[Class4NicDetailV2] = Json.format[Class4NicDetailV2]
}
