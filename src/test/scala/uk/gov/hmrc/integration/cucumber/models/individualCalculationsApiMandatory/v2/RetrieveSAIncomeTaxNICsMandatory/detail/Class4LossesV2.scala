/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json._

case class Class4LossesV2(totalClass4LossesAvailable: BigInt, totalClass4LossesUsed: BigInt, totalClass4LossesCarriedForward: BigInt)

object Class4LossesV2 {
  implicit val format: OFormat[Class4LossesV2] = Json.format[Class4LossesV2]
}
