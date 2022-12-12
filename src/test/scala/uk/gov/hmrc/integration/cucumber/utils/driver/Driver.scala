/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils.driver

import com.typesafe.scalalogging.LazyLogging
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import uk.gov.hmrc.webdriver.SingletonDriver

object Driver extends LazyLogging {

  logger.info(
    s"Instantiating Browser: ${sys.props.getOrElse("browser", "'browser' System property not set. This is required")}"
  )

  if (!Option(System.getProperty("browser")).exists(_.nonEmpty)) {
    System.setProperty("browser", "chrome")
  }

  val options = new ChromeOptions()
  options.setHeadless(false) // Set value to false if the browser type 'chrome' is used in script files to view UI
  lazy val instance: WebDriver = SingletonDriver.getInstance(Some(options))
}

