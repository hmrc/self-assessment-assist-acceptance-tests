/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs

import io.cucumber.datatable.DataTable
import play.api.libs.json.{JsObject, Json}
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

import uk.gov.hmrc.integration.cucumber.utils.json.JsonTools
import scala.collection.JavaConverters._

class MergeResultsStepDef extends BaseStepDef with JsonTools {

  private var govTestScenarios    = List.empty[String]
  private var cumulativeJsonPaths = Set.empty[String]

  private def reset(): Unit = {
    govTestScenarios = List.empty
    cumulativeJsonPaths = Set.empty
  }

  Given("""a list of gov-test-scenarios:""") { data: DataTable =>
    reset()

    govTestScenarios = data.asList().asScala.toList
  }

  When("""^requests are made to GET to url (.*) for each of these scenarios$""") { urlKey: String =>
    govTestScenarios.foreach { gtsName =>
      val scenario = if (gtsName == "None") None else Some(gtsName)

      response = requestGET(urlKey, requestHeaders, scenario)

      val responseJson = Json.parse(response.body).as[JsObject]

      cumulativeJsonPaths = cumulativeJsonPaths ++ pathsFor(responseJson)
    }
  }
}
