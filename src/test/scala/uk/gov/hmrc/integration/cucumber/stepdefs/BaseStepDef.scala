/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.stepdefs

import io.cucumber.scala.{ScalaDsl, EN}
import uk.gov.hmrc.integration.cucumber.config.Environments

trait BaseStepDef extends ScalaDsl with EN with Environments
