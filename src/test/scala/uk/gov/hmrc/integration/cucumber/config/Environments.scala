/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.config

import com.typesafe.config.ConfigFactory
//import uk.gov.hmrc.integration.cucumber.endpoints.BasePage.removeWhiteSpace

trait Environments {

  private val config = ConfigFactory.load("environments.conf")
  val env: String    = Option(System.getProperty("env")).getOrElse("development")

  val saAssistApiUrl: String                           = config.getString(s"environments.$env.self-assessment-assist-api")
  val saAssistAcknowledgeApiUrl: String                = config.getString(s"environments.$env.self-assessment-assist-Acknowledge-api")
  val saAssistAcknowledgeInvalidReportIDApiUrl: String = config.getString(s"environments.$env.sassist-InvalidAcknowledge-api")
  val saAssistGenerateApiInvalidCalc: String           = config.getString(s"environments.$env.selfassessment-assist-api")
  val saApiUrl: String                                 = config.getString(s"environments.$env.self-assessment-api")
  val individualLossesApiUrl: String                   = config.getString(s"environments.$env.individual-losses-api")
  val individualCalculationApiUrl: String              = config.getString(s"environments.$env.individual-calculations-api")
  val individualsIncomeReceivedApiUrl: String          = config.getString(s"environments.$env.individuals-income-received-api")
  val individualsReliefsApiUrl: String                 = config.getString(s"environments.$env.individuals-reliefs-api")
  val otherDeductionsApiUrl: String                    = config.getString(s"environments.$env.other-deductions-api")
  val propertyBusinessApiUrl: String                   = config.getString(s"environments.$env.property-business-api")
  val saAccountsApiUrl: String                         = config.getString(s"environments.$env.self-assessment-accounts-api")
  val saBissApiUrl: String                             = config.getString(s"environments.$env.self-assessment-biss-api")
  val saBsasApiUrl: String                             = config.getString(s"environments.$env.self-assessment-bsas-api")
  val businessDetailsApiUrl: String                    = config.getString(s"environments.$env.business-details-api")
  val obligationsApiUrl: String                        = config.getString(s"environments.$env.obligations-api")
  val individualsExpensesApiUrl: String                = config.getString(s"environments.$env.individuals-expenses-api")
  val individualsDisclosuresApiUrl: String             = config.getString(s"environments.$env.individuals-disclosures-api")
  val individualsStateBenefitsApiUrl: String           = config.getString(s"environments.$env.individuals-state-benefits-api")
  val individualsChargesApiUrl: String                 = config.getString(s"environments.$env.individuals-charges-api")
  val individualsBusinessEOPSApiUrl: String            = config.getString(s"environments.$env.individuals-business-eops-api")
  val selfEmploymentBusinessApiUrl: String             = config.getString(s"environments.$env.self-employment-business-api")
  val cisDeductionsApiUrl: String                      = config.getString(s"environments.$env.cis-deductions-api")

  val apiPlatformTestUserUrl: String = config.getString(s"environments.$env.api-platform-test-user")

  val apiPlatformAgentsAuthUrl: String     = config.getString(s"environments.$env.api-platform-agents-auth")
  val apiPlatformAgentsAuthTestUrl: String = config.getString(s"environments.$env.api-platform-agents-auth-test")
  val multiFactorAuthenticationUrl: String = config.getString(s"environments.$env.mfa-frontend")

  val authLoginApiUrl: String  = config.getString(s"environments.$env.auth-login-api")
  val authLoginStubUrl: String = config.getString(s"environments.$env.auth-login-stub")

  object thirdPartyApp {
    val redirectUrl: String  = config.getString(s"environments.$env.third-party-application.redirect-url")
    val clientId: String     = config.getString(s"environments.$env.third-party-application.client-id")
    val clientSecret: String = config.getString(s"environments.$env.third-party-application.client-secret")
  }

  object thirdPartyToken3 {
    // val redirectUrl: String  = config.getString(s"environments.$env.third-party-token.redirect-url")
    val clientId1: String     = config.getString(s"environments.$env.third-party-token.client-id")
    val clientSecret1: String = config.getString(s"environments.$env.third-party-token.client-secret")
  }

  val oauthFrontendUrl: String    = config.getString(s"environments.$env.oauth-frontend")
  val oauthApiUrl: String         = config.getString(s"environments.$env.oauth-api")
  val oauthApiExtendedUrl: String = config.getString(s"environments.$env.oauth-api-extended")

  val oauthAuthorizeUrl: String = //"https://www.development.tax.service.gov.uk/oauth/authorize?client_id=iQDo7HowRCnXauDjis1dcmdfS8m4&redirect_uri=urn:ietf:wg:oauth:2.0:oob&scope=read:self-assessment-assist write:self-assessment-assist&response_type=code"
    s"${oauthApiExtendedUrl}/authorize?client_id=${thirdPartyApp.clientId}&scope=read:self-assessment-assist write:self-assessment-assist&response_type=code&redirect_uri=${thirdPartyApp.redirectUrl}"

}
