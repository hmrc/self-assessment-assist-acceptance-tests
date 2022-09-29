/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils.runners.ObligationsApi

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("uk.gov.hmrc.integration.cucumber.stepdefs"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = "@ObligationsApiSmoke or @Shutdown"
)
class SmokeRunner
