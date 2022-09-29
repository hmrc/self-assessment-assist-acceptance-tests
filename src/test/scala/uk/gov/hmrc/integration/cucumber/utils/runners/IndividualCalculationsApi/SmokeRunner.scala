/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils.runners.IndividualCalculationsApi

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("uk.gov.hmrc.integration.cucumber.stepdefs"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = "@IndividualCalculationApiSmoke or @IndividualCalculationApiSmokeV2 or @IndividualCalculationApiSmokeV3 or @Shutdown"
)
class SmokeRunner
