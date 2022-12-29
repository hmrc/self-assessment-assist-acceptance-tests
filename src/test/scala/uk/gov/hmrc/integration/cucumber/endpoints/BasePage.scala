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

package uk.gov.hmrc.integration.cucumber.endpoints

import com.google.gson.{JsonObject, JsonParser}
import io.cucumber.scala.ScalaDsl
import org.apache.commons.lang3.RandomStringUtils
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.scalatest.matchers.should.Matchers
import play.api.libs.json.Json
import scalaj.http.{Http, HttpOptions, HttpRequest, HttpResponse}
import uk.gov.hmrc.integration.cucumber.config.Environments
import uk.gov.hmrc.integration.cucumber.endpoints.Auth.AuthLoginApi.{authTokenGeneratorBodyForLocalTesting, authTokenGeneratorBodyWithInvalidNinoForLocalTesting, postNinoBodyForLocalTesting}
import uk.gov.hmrc.integration.cucumber.endpoints.RequestBodies.retrieveRequestBody
import uk.gov.hmrc.integration.cucumber.endpoints.URLs.retrieveRequestUrl
import uk.gov.hmrc.integration.cucumber.models.domain.Nino
import uk.gov.hmrc.integration.cucumber.stepdefs.{BaseStepDef, Credentials}
import uk.gov.hmrc.integration.cucumber.utils.Zap
import uk.gov.hmrc.integration.cucumber.utils.driver.Driver

import java.net.{InetSocketAddress, Proxy}
import java.time.{Duration, LocalDateTime}
import java.util.UUID
import scala.util.Random

object BasePage extends BasePage

trait BasePage extends Matchers with ScalaDsl with Environments with BaseStepDef {

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ FRONTEND UI FUNCTIONS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  val driver: WebDriver = Driver.instance
  //val driver: WebDriver = Driver.instance

  def navigateTo(url: String): Unit = driver.navigate().to(url)

  def findElementById(id: String): WebElement = driver.findElement(By.id(id))

  def findElementByName(name: String): WebElement = driver.findElement(By.name(name))

  def findElementByTagName(name: String): WebElement = driver.findElement(By.tagName(name))

  def findElementByCssSelector(css: String): WebElement = driver.findElement(By.cssSelector(css))

  def confirmUrl(url: String): Unit = {
    fluentWait.until(ExpectedConditions.urlContains(url))
    val currentUrl = driver.getCurrentUrl
    assert(currentUrl.contains(url) || url.contains(currentUrl))
  }

  val fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(20))
    .pollingEvery(Duration.ofMillis(250))

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ FUNCTIONS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  def removeWhiteSpace(value: String): String = {
    value.split('\n').map(_.trim.filter(_ >= ' ')).mkString.replaceAll("\\s", "")
  }

  def todayDate: String = {
    LocalDateTime.now.toString.split("T")(0)
  }

  val validNinoForLocalTesting: String = "AA000000B"
  val invalidNinoForLocalTesting: String = "AA0000000"
  val reportIdForLocalTesting: String = "a365c0b4-06e3-4fef-a555-16fd0877dc7c"
  val invalidReportIdForLocalTesting: String = "a365c0b4-06e3-4fef-a555-16fd0877dc7"
  val correlationIdForLocalTesting: String = "a5fht738957jfjf845jgjf855"
  val invalidCorrelationIdForLocalTesting: String = "a5fht738957jfjf845jgjf85"

  def getTaxYear: String = Seq(LocalDateTime.now.getYear.toString, LocalDateTime.now.plusYears(1).getYear.toString.takeRight(2)).mkString("-")

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ TEST PARAMETERS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  case class TaxPayer(nino: String, mtditid: String, accessToken: String, agentReferenceNumber: Option[String] = None)

  case class Request(method: String, url: String, body: Option[String], headers: Map[String, String], govTestScenario: Option[Map[String, String]])

  var taxPayer: TaxPayer             = TaxPayer(null, null, null, None)
  var request: Request               = Request(null, null, None, requestHeaders, None)
  var response: HttpResponse[String] = _
  var apiVersion: String             = "1.0"
  var selfEmploymentId: String       = _
  var selfEmploymentId2nd: String    = _
  var idValue: String                = _
  var submissionId: String           = _
  var newSource: String              = _

  val contentTypeHeader: Map[String, String]           = Map("Content-Type" -> "application/json")
  val contentTypeUrlEncodedHeader: Map[String, String] = Map("Content-Type" -> "application/x-www-form-urlencoded")

  def requestHeaders: Map[String, String] = Map(
    "Accept"        -> s"application/vnd.hmrc.$apiVersion+json",
    "Authorization" -> s"${taxPayer.accessToken}",
    "Content-Type"  -> "application/json"
  )

  def requestHeadersForPostNinoCall: Map[String, String] = Map(
    "Accept"        -> s"application/vnd.hmrc.$apiVersion+json",
    "Authorization" -> s"",
    "Content-Type"  -> "application/json"
  )

  object AffinityGroup extends Enumeration {
    val Individual: String   = "Individual"
    val Organisation: String = "Organisation"
    val Agent: String        = "Agent"
  }

  object CredentialRole extends Enumeration {
    val User: String  = "User"
    val Admin: String = "Admin"
  }

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ RANDOM GENERATORS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  def randomNumberBetween(min: Int, max: Int): Int = scala.util.Random.nextInt(max - min) + min

  def randomNino: String = nextNino.value

  def invalidNino: String = "GB123456D"

  private def nextNino = {
    val prefix = Random.shuffle(Nino.validPrefixes).head
    val suffix = Random.shuffle(Nino.validSuffixes).head
    val digits = (0 to 5).map(_ => Random.nextInt(10)).foldLeft("")((acc, curr) => acc + curr.toString)

    Nino(s"$prefix$digits$suffix")
  }

  lazy val randomBusinessId: String = {
    val initialChar = "X"
    val prefix      = RandomStringUtils.randomAlphanumeric(1).toUpperCase
    val middleChars = "IS"
    val suffix      = RandomStringUtils.randomNumeric(11)
    s"$initialChar$prefix$middleChars$suffix"
  }

  lazy val randomSubmissionId: String = mtdFormatUUID

  def mtdFormatUUID: String = {

    val aToFZeroToNine = "abcdef0123456789".split("")
    val ab89           = "89ab".split("")

    def getRandomCharacter(array: Array[String]): String =
      array(Random.nextInt(array.length))

    implicit class intTimes(i: Int) {
      def times(fn: => String): String = ((1 to i) map (x => fn)).mkString
    }

    s"${8 times getRandomCharacter(aToFZeroToNine)}-" +
      s"${4 times getRandomCharacter(aToFZeroToNine)}-" +
      s"4${3 times getRandomCharacter(aToFZeroToNine)}-" +
      s"${getRandomCharacter(ab89)}${3 times getRandomCharacter(aToFZeroToNine)}-" +
      s"${12 times getRandomCharacter(aToFZeroToNine)}"
  }

  def randomMtditid: String = {
    val suffix = "XXIT"
    val number = new Random().nextInt(999999999)
    f"$suffix$number%011d"
  }

  def randomSelfEmploymentId: String = {
    val initialChar = "X"
    val prefix      = RandomStringUtils.randomAlphanumeric(1).toUpperCase
    val middleChars = "IS"
    val suffix      = RandomStringUtils.randomNumeric(11)

    s"$initialChar$prefix$middleChars$suffix"
  }

  def randomCalcId: String = {
    def n(l: Int): String = RandomStringUtils.randomNumeric(l)

    def nb(min: Int, max: Int): String = randomNumberBetween(min, max).toString

    val optionOne: String = n(8)
    val optionTwo: String = n(4) + "abcd-ef" + n(2) + "-" + nb(1, 5) + "ab" + n(1) + "-" + nb(8, 9) + "af" + n(1) + "-fe" + n(6) + "dcba"

    if (nb(0, 1) == "1") optionOne else optionTwo
  }

  def randomLossId: String = {
    val randomString = UUID.randomUUID().toString
    val lossId       = randomString.replaceAll("-", "").take(15)
    lossId
  }

  def randomClaimId: String = {
    val randomString = UUID.randomUUID().toString
    randomString.replaceAll("-", "").take(15)
  }

  def randomSavingsAccountId: String = randomClaimId

  def randomBsasId: String = {
    UUID.randomUUID().toString
  }

  def randomPaymentId: String = {
    RandomStringUtils.randomNumeric(12) + "-" + RandomStringUtils.randomNumeric(6)
  }

  def randomTransactionId: String = {
    RandomStringUtils.randomNumeric(12)
  }

  def randomDeductionId: String = {
    // conform to  ^[A-Z][0-9]{4}[A-Z][0-9]{2}[A-Z][0-9][A-Z]{2}[0-9]{4}[A-Z]$
    RandomStringUtils.randomAlphabetic(1).toUpperCase ++
      RandomStringUtils.randomNumeric(4) ++
      RandomStringUtils.randomAlphabetic(1).toUpperCase ++
      RandomStringUtils.randomNumeric(2) ++
      RandomStringUtils.randomAlphabetic(1).toUpperCase ++
      RandomStringUtils.randomNumeric(1) ++
      RandomStringUtils.randomAlphabetic(2).toUpperCase ++
      RandomStringUtils.randomNumeric(4) ++
      RandomStringUtils.randomAlphabetic(1).toUpperCase
  }

  def randomEmploymentId: String = randomBenefitId

  def randomBenefitId: String = {
    val shortNumericCharList: Seq[Char]      = Seq("1", "2", "3", "4", "5").map(_.charAt(0))
    val shortAlphanumericCharList: Seq[Char] = Seq("8", "9", "a", "b").map(_.charAt(0))
    val longAlphanumericCharList: Seq[Char]  = Seq("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f").map(_.charAt(0))

    RandomStringUtils.random(8, longAlphanumericCharList: _*) +
      "-" + RandomStringUtils.random(4, longAlphanumericCharList: _*) +
      "-" + RandomStringUtils.random(1, shortNumericCharList: _*) + RandomStringUtils.random(3, longAlphanumericCharList: _*) +
      "-" + RandomStringUtils.random(1, shortAlphanumericCharList: _*) + RandomStringUtils.random(3, longAlphanumericCharList: _*) +
      "-" + RandomStringUtils.random(12, longAlphanumericCharList: _*)
  }

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ REQUEST UTILS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  def getHttpWithTimeout(url: String, connectionTimeout: Int = 10000, readTimeout: Int = 60000): HttpRequest = {
    Http(url).option(HttpOptions.connTimeout(connectionTimeout)).option(HttpOptions.readTimeout(readTimeout))
  }

  lazy val proxy: Option[Proxy] = if (Zap.enabled) {
    Some(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 11000)))
  } else {
    None
  }

  def requestGET(url: String, commonHeaders: Map[String, String] = requestHeaders, govTestScenario: Option[String] = None): HttpResponse[String] = {

    val getUrl                                     = retrieveRequestUrl(url)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("GET", getUrl, None, commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(getUrl).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()

    response
  }

  def postNinoLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                           govTestScenario: Option[String] = None): HttpResponse[String] = {

    val postBody                                   = postNinoBodyForLocalTesting
    val postUrl                                    = "http://localhost:9612/pay-as-you-earn/02.00.00/individuals/AA000000"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, Some(postBody), commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData(postBody).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the post nino call is : "+response )

    if (printConfig) printRequestAndResponseLog()
    response
  }

  def authTokenGeneratorLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                     govTestScenario: Option[String] = None): Map[String, String] = {

    val postBody                                   = authTokenGeneratorBodyForLocalTesting
    val postUrl                                    = "http://localhost:8585/government-gateway/session/login"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, Some(postBody), commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData(postBody).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the auth token generator is : "+response )

    val bearerToken: String = response.header("Authorization").get
    print("\n"+"Bearer token is :" + bearerToken)
    commonHeaders + ("Authorization" -> bearerToken)
  }

  def generateReportLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                 govTestScenario: Option[String] = None): HttpResponse[String] = {
    val headers = authTokenGeneratorLocalTesting(commonHeaders, govTestScenario)

    val postUrl                                    = s"http://localhost:8342/reports/$validNinoForLocalTesting/111190b4-06e3-4fef-a555-6fd0877dc7ca"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))
    request = Request("POST", postUrl, None, headers, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData("{}").headers(headers ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the generate report is : "+response )

    val reportID : String = response.body.split("\"reportId\":\"")(1).split("\"")(0)
    print("\n"+"ReportId is :" +reportID)

    val correlationID : String = response.body.split("\"correlationId\":\"")(1).split("\"")(0)
    print("\n"+"CorrelationId is :" +correlationID)


    if (printConfig) printRequestAndResponseLog()
    response
  }

  def generateAcknowledgeReportLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                            govTestScenario: Option[String] = None): HttpResponse[String] = {

    val headers = authTokenGeneratorLocalTesting(commonHeaders,govTestScenario)

    val postUrl                                    = s"http://localhost:8342/reports/acknowledge/$validNinoForLocalTesting/$reportIdForLocalTesting/$correlationIdForLocalTesting"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))
    request = Request("POST", postUrl, None, headers, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData("{}").headers(headers ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the acknowledge report is : "+response )

    if (printConfig) printRequestAndResponseLog()
    response
  }

  //***** Negative scenarios ****** \\
  def authTokenGeneratorWithInvalidNinoLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                     govTestScenario: Option[String] = None): HttpResponse[String] = {

    val postBody                                   = authTokenGeneratorBodyWithInvalidNinoForLocalTesting
    val postUrl                                    = "http://localhost:8585/government-gateway/session/login"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, Some(postBody), commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData(postBody).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the auth token generator is : "+response )
    assert(response.body contains(invalidNinoForLocalTesting+" is not a valid nino"))

    if (printConfig) printRequestAndResponseLog()
    response
  }

  def generateReportWithInvalidNinoLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                 govTestScenario: Option[String] = None): HttpResponse[String] = {
    val headers = authTokenGeneratorLocalTesting(commonHeaders, govTestScenario)

    val postUrl                                    = s"http://localhost:8342/reports/$invalidNinoForLocalTesting/111190b4-06e3-4fef-a555-6fd0877dc7ca"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))
    request = Request("POST", postUrl, None, headers, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData("{}").headers(headers ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString
    print("\n"+"The response at the generate report is : "+response )
    if (printConfig) printRequestAndResponseLog()
    response
  }

  def generateAcknowledgeReportWithInvalidReportIdLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                            govTestScenario: Option[String] = None): HttpResponse[String] = {

    val headers = authTokenGeneratorLocalTesting(commonHeaders,govTestScenario)

    val postUrl                                    = s"http://localhost:8342/reports/acknowledge/$validNinoForLocalTesting/$invalidReportIdForLocalTesting/$correlationIdForLocalTesting"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))
    request = Request("POST", postUrl, None, headers, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData("{}").headers(headers ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()
    response
  }

  def generateAcknowledgeReportWithInvalidCorrelationIdLocalTesting(commonHeaders: Map[String, String] = requestHeadersForPostNinoCall,
                                                               govTestScenario: Option[String] = None): HttpResponse[String] = {

    val headers = authTokenGeneratorLocalTesting(commonHeaders,govTestScenario)

    val postUrl                                    = s"http://localhost:8342/reports/acknowledge/$validNinoForLocalTesting/$reportIdForLocalTesting/$invalidCorrelationIdForLocalTesting"
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))
    request = Request("POST", postUrl, None, headers, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData("{}").headers(headers ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()
    response
  }

  def requestPOST(url: String,
                  body: String,
                  commonHeaders: Map[String, String] = requestHeaders,
                  govTestScenario: Option[String] = None): HttpResponse[String] = {

    val postBody                                   = retrieveRequestBody(body)
    val postUrl                                    = retrieveRequestUrl(url)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, Some(postBody), commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(postUrl).postData(postBody).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()

    response
  }

  def requestEmptyPOST(url: String,
                       commonHeaders: Map[String, String] = requestHeaders,
                       govTestScenario: Option[String] = None): HttpResponse[String] = {

    val postUrl                                    = URLs.retrieveRequestUrl(url)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, None, commonHeaders, Some(govTestScenarioHeader))
    response =
      getHttpWithTimeout(postUrl).method("POST").headers(commonHeaders ++ govTestScenarioHeader).postData("").copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()
    printRequestAndResponseLog()

    response
  }

  def requestEmptyPOSTWithCredentials(url: String,
                                      commonHeaders: Map[String, String] = requestHeaders,
                                      govTestScenario: Option[String] = None,
                                      credentials: Credentials): HttpResponse[String] = {

    val postUrl                                    = URLs.retrieveRequestUrlWithCredentials(url, credentials)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("POST", postUrl, None, commonHeaders, Some(govTestScenarioHeader))
    response =
      getHttpWithTimeout(postUrl).method("POST").headers(commonHeaders ++ govTestScenarioHeader).postData("").copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()
    printRequestAndResponseLog()

    response
  }

  def requestGETWithQueryParams(url: String,
                                queryParams: String,
                                commonHeaders: Map[String, String] = requestHeaders,
                                govTestScenario: Option[String] = None): HttpResponse[String] = {

    val getUrl                                     = retrieveRequestUrl(url) + queryParams
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("GET", getUrl, None, commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(getUrl).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()

    response
  }

  def requestPUT(url: String,
                 body: String,
                 commonHeaders: Map[String, String] = requestHeaders,
                 govTestScenario: Option[String] = None): HttpResponse[String] = {

    val putBody                                    = retrieveRequestBody(body)
    val putUrl                                     = retrieveRequestUrl(url)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("PUT", putUrl, Some(putBody), commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(putUrl).put(putBody).headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()

    response
  }

  def requestDELETE(url: String,
                    commonHeaders: Map[String, String] = requestHeaders,
                    govTestScenario: Option[String] = None): HttpResponse[String] = {

    val deleteUrl                                  = URLs.retrieveRequestUrl(url)
    val govTestScenarioHeader: Map[String, String] = govTestScenario.fold(Map.empty[String, String])(value => Map("Gov-Test-Scenario" -> value))

    request = Request("DELETE", deleteUrl, None, commonHeaders, Some(govTestScenarioHeader))
    response = getHttpWithTimeout(deleteUrl).method("DELETE").headers(commonHeaders ++ govTestScenarioHeader).copy(proxyConfig = proxy).asString

    if (printConfig) printRequestAndResponseLog()

    response
  }

  // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ LOGS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

  private val debugEnabled = sys.props.get("debug").isDefined
  val printConfig: Boolean = debugEnabled

  def errorLog(expectedBody: Option[String] = None): String = {
    "\n\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓" +
      "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
      "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" +
      s"\n\nRequest method: ${request.method}" +
      s"\nRequest url: ${request.url}" +
      (if (request.body.nonEmpty) {
         s"\n\nRequest body: ${Json.prettyPrint(Json.parse(request.body.get))}"
       } else "") +
      s"\nRequest Gov-Test-Scenario: " + (if (request.govTestScenario.get.nonEmpty) s"${request.govTestScenario.get}" else "None") +
      s"\nRequest headers: \n${"  " + request.headers.mkString("\n  ")}" +
     // (if (expectedBody.nonEmpty) s"\n\nExpected response body: \n${Json.prettyPrint(Json.parse(expectedBody.get))}" else "") +
      s"\n\nResponse code: ${response.code}" +
      s"\nResponse body: ${if (response.body.nonEmpty) s"\n${Json.prettyPrint(Json.parse(response.body))}" else """¯\_(ツ)_/¯"""}" +
      s"\nResponse headers:\n${"  " + response.headers.mkString("\n")}\n" +
      "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" +
      "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
      "\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n\n"
  }

  def printRequestAndResponseLog(): Unit = {
    println(
      "\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
        s"\nRequest method: ${request.method}" +
        s"\nRequest url: ${request.url}" +
        (if (request.body.nonEmpty) {
           s"\nRequest body: ${Json.prettyPrint(Json.parse(request.body.get))}"
         } else "") +
        s"\nRequest Gov-Test-Scenario: " + (if (request.govTestScenario.get.nonEmpty) s"${request.govTestScenario.get}" else "None") +
        s"\nRequest headers: \n${"  " + request.headers.mkString("\n  ")}" +
        s"\n\nResponse code: ${response.code} " +
        s"\nResponse body: ${if (response.body.nonEmpty) s"\n${Json.prettyPrint(Json.parse(response.body))}" else """¯\_(ツ)_/¯"""}" +
        s"\nResponse headers:\n${"  " + response.headers.mkString("\n  ")}" +
        "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░")
  }

  def jsonParser(body: String): JsonObject = {
    JsonParser.parseString(body).getAsJsonObject
  }

}
