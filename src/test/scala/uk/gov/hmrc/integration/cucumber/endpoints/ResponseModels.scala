/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import play.api.libs.json.{Json, OFormat, Reads, Writes}
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLinks

object ResponseModels {

  def checkResponseBodyStructure[A: Writes](body: String, expectedBody: Option[String] = None)(implicit rds: Reads[A]): Unit = {
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          scala.Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        valid =>
          if (expectedBody.isDefined) {
            Json.toJson(valid) shouldBe Json.parse(expectedBody.get)
          } else {
            scala.Predef.assert(assertion = true)
          }
      )
  }

  def checkAgainstExpectedModel(responseName: String, expectedBody: Option[String] = None): Unit = {
    responseName match {
      case "HateoasLinks" => checkResponseBodyStructure[HateoasLinks](response.body)
      case _              => checkResponseBodyStructure[notFound](response.body)

    }
  }

  case class notFound(notFound: String)

  object notFound {
    implicit val writes: OFormat[notFound] = Json.format[notFound]
  }

}
