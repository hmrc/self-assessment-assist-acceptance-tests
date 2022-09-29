/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class Class2NicDetailV2(weeklyRate: BigDecimal,
                             weeks: BigDecimal,
                             limit: BigDecimal,
                             apportionedLimit: BigDecimal,
                             underSmallProfitThreshold: Boolean,
                             actualClass2Nic: Boolean,
                             class2VoluntaryContributions: Boolean)

object Class2NicDetailV2 {
  implicit val format: OFormat[Class2NicDetailV2] = Json.format[Class2NicDetailV2]
}
