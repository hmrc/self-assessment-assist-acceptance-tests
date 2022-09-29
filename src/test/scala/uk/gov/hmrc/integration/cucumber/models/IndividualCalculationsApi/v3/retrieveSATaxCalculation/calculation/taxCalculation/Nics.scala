/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.nics._

case class Nics(class2Nics: Option[Class2Nics],
                class4Nics: Option[Class4Nics],
                nic2NetOfDeductions: Option[BigDecimal],
                nic4NetOfDeductions: Option[BigDecimal],
                totalNic: Option[BigDecimal])

object Nics {
  implicit val format: OFormat[Nics] = Json.format[Nics]
}