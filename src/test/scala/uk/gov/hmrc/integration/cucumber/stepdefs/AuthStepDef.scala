/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.TestUserCreation._

class AuthStepDef extends BaseStepDef {

  // Authorised on API Platform
  Given("""^an individual is authorised on the API Platform$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Individual)
    else taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent is authorised on the API Platform$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Agent)
    else taxPayer = createAgentUserAuthorisedOnApiPlatform
    printTaxPayer()
  }

  // Authorised
  Given("""^an individual is authorised$""") { () =>
    taxPayer = createLocalTestUser(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent is authorised$""") { () =>
    taxPayer = createLocalTestUser(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Invalid nino
  Given("""^an individual uses wrong nino$""") { () =>
    taxPayer = createLocalTestUserWithInvalidNino(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent uses wrong client nino$""") { () =>
    taxPayer = createLocalTestUserWithInvalidNino(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Mtditid doesn't match nino used, in business details repo (des-simulator)
  Given("""^an individual's enrolment contains wrong mtditid$""") { () =>
    taxPayer = createLocalTestUserWithNoMatchingMtditid(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent's delegated enrolment contains wrong mtditid$""") { () =>
    taxPayer = createLocalTestUserWithNoMatchingMtditid(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Invalid bearer token
  Given("""^an individual has an invalid bearer token$""") { () =>
    taxPayer = createLocalTestUserWithInvalidBearerToken(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent has an invalid bearer token$""") { () =>
    taxPayer = createLocalTestUserWithInvalidBearerToken(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Not enrolled for mtd-sa
  Given("""^an individual is not enrolled for mtd-sa$""") { () =>
    taxPayer = createLocalTestUserWithInvalidEnrolment(AffinityGroup.Individual)
    printTaxPayer()
  }

  // Agent is not enrolled, but client is enrolled
  Given("""^an agent is not enrolled for agent services$""") { () =>
    taxPayer = createLocalTestUserWithInvalidEnrolment(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Agent is enrolled, and client is enrolled, but agent is not linked to client
  Given("""^an agent is not authorised by the client$""") { () =>
    taxPayer = createLocalAgentNotAuthorisedForClient
    printTaxPayer()
  }

}
