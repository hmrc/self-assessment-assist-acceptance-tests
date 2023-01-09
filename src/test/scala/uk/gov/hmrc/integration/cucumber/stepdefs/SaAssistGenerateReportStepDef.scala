package uk.gov.hmrc.integration.cucumber.stepdefs

import com.google.gson.JsonObject
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.TestUserCreation._
import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.utils.data.TestData

case class Credentials(reportId: String, calculationId: String, correlationId: String)

class SaAssistGenerateReport extends BaseStepDef with TestData {

  var credentials: Option[Credentials] = None;

  Given("""^I generate tax payers for given environment$""") { () =>
    env match {
      case "local" =>
        taxPayer = createLocalTestUser(AffinityGroup.Individual)
        printGeneratedTaxPayer(AffinityGroup.Individual)
        taxPayer = createLocalTestUser(AffinityGroup.Organisation)
        printGeneratedTaxPayer(AffinityGroup.Organisation)
        taxPayer = createLocalTestUser(AffinityGroup.Agent)
        printGeneratedTaxPayer(AffinityGroup.Agent)
      case "externaltest" =>
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
        printGeneratedTaxPayer(AffinityGroup.Individual)
        taxPayer = createAgentUserAuthorisedOnApiPlatform
        printGeneratedTaxPayer(AffinityGroup.Agent)
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Organisation)
        print(AffinityGroup.Organisation)
      case "development" =>
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
        printGeneratedTaxPayer(AffinityGroup.Individual)
        taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Organisation)
        printGeneratedTaxPayer(AffinityGroup.Organisation)
    }
  }

  When("""^I make a POST call to (.*) url to generate report with valid nino and request body (.*)$""") {
    (url: String, scenario:String) =>
      response = requestEmptyPOST(url, requestHeaders, if(scenario != "None") Some(scenario) else None)
      val responseObject: JsonObject = jsonParser(response.body)
      credentials = Some(
        Credentials(
          responseObject.get("reportId").getAsString,
          responseObject.get("calculationId").getAsString,
          responseObject.get("correlationId").getAsString
    ))
  }

  When("""^I make a POST call to (.*) url to generate acknowledge report with valid nino and request body (.*)$""") {
    (url: String, scenario: String) =>
      if (credentials.isDefined) {
        response = requestEmptyPOSTWithCredentials(url, requestHeaders, if (scenario != "None") Some(scenario) else None, credentials.get)
      } else {
        throw new Exception("Credentials are not defined, please check!")
      }
  }

      def printGeneratedTaxPayer(affinityGroup: String): Unit = {
        val client: String = if(affinityGroup == AffinityGroup.Agent) "client " else ""
        println(s"\n░░░▒▒▒▓▓▓▓ Self Assessment Assist ▓▓▓▒▒▒░░░\naffinity group: $affinityGroup\n${client}identifier: ${taxPayer.nino}\naccess token: ${taxPayer.accessToken}\n")
      }
  }