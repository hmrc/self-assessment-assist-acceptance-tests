/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail

import play.api.libs.json._

case class NicDetailV2(class2Nics: Class2NicDetailV2, class4Nics: Class4NicDetailV2)

object NicDetailV2 {
  implicit val format: OFormat[NicDetailV2] = Json.format[NicDetailV2]
}
