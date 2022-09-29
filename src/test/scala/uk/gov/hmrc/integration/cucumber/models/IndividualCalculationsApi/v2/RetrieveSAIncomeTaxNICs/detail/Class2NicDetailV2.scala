/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class Class2NicDetailV2(weeklyRate: Option[BigDecimal],
                             weeks: Option[BigDecimal],
                             limit: Option[BigDecimal],
                             apportionedLimit: Option[BigDecimal],
                             underSmallProfitThreshold: Boolean,
                             actualClass2Nic: Option[Boolean],
                             class2VoluntaryContributions: Option[Boolean])

object Class2NicDetailV2 {
  implicit val format: OFormat[Class2NicDetailV2] = Json.format[Class2NicDetailV2]
}
