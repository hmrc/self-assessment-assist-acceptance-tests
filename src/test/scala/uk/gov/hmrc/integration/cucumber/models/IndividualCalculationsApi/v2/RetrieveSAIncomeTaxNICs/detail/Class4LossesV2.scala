/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json._

case class Class4LossesV2(totalClass4LossesAvailable: Option[BigInt],
                          totalClass4LossesUsed: Option[BigInt],
                          totalClass4LossesCarriedForward: Option[BigInt])

object Class4LossesV2 {
  implicit val format: OFormat[Class4LossesV2] = Json.format[Class4LossesV2]
}
