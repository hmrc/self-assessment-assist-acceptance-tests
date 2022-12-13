/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
