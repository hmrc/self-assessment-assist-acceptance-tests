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

package uk.gov.hmrc.integration.cucumber.utils.data

case class User(enrolments: List[Enrolment], userType: String, nino: Option[String] = None)

case class Enrolment(key: String, name: String, value: String, name2: Option[String] = None, value2: Option[String] = None)

trait TestData {

  def getUser(userType: String): User = {
    val taxIdentifier = userType.toLowerCase()

    taxIdentifier match {
      case "nino" =>
        User(List(), userType, Some(ninoNumber))
      case "nino1" =>
        User(List(), userType, Some(ninoNumber1))
      case "sautr" =>
        User(List(Enrolment(key = enrolmentKey, name = identifierName, value = identifierValue)), userType)
      case "nino with sautr" =>
        User(List(Enrolment(key = enrolmentKey, name = identifierName, value = identifierValueSaUtr)), userType, Some(ninoNumber))
      case "nino with sautr1" =>
        User(List(Enrolment(key = enrolmentKey, name = identifierName, value = identifierValueSaUtr1)), userType, Some(ninoNumber))
      case "nino with sautr2" =>
        User(List(Enrolment(key = enrolmentKey, name = identifierName, value = identifierValueSaUtr2)), userType, Some(ninoNumber2))
    }
  }

  //test utils.data
  val credentialStrength: String = "strong"
  val confidenceLevel: String = "200"
  val affinityGroup: String = "Individual"
  val btaAffinityGroup: String = "Organisation"
  val redirectUrl: String = ""
  val enrolmentKey: String = "IR-SA"
  val identifierName: String = "UTR"
  val ninoNumber: String = "AA065213C"
  val ninoNumber1: String = "SP222333A"
  val ninoNumber2: String = "SP445566A"
  val identifierValue: String = "1234567890"
  val identifierValueSaUtr: String = "6234449230"
  val identifierValueSaUtr1: String = "6234449231"
  val identifierValueSaUtr2: String = "6234449235"
  val enrolmentKeyCt: String = "IR-CT"
  val identifierNameCt: String = "UTR"
}
