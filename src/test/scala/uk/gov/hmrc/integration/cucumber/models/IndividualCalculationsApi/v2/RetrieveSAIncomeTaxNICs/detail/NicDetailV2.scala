/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json._

case class NicDetailV2(class2Nics: Option[Class2NicDetailV2], class4Nics: Option[Class4NicDetailV2])

object NicDetailV2 {
  implicit val format: OFormat[NicDetailV2] = Json.format[NicDetailV2]
}
