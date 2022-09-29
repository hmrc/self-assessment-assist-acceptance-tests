/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.taxCalculationMandatory.nicsMandatory._

case class NicsMandatory(class2Nics: Class2NicsMandatory,
                         class4Nics: Class4NicsMandatory,
                         nic2NetOfDeductions: BigDecimal,
                         nic4NetOfDeductions: BigDecimal,
                         totalNic: BigDecimal)

object NicsMandatory {
  implicit val format: OFormat[NicsMandatory] = Json.format[NicsMandatory]
}