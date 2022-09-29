/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualDisclosuresApi

import play.api.libs.json.{Json, OFormat}

case class Class2Nics(class2VoluntaryContributions: Option[Boolean])

object Class2Nics {
  implicit val format: OFormat[Class2Nics] = Json.format[Class2Nics]
}
