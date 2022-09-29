/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory.lumpSumsDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class TaxableLumpSumsAndCertainIncomeMandatory(amount: BigDecimal,
                                                    taxPaid: BigDecimal,
                                                    taxTakenOffInEmployment: Boolean)

object TaxableLumpSumsAndCertainIncomeMandatory {
  implicit val format: OFormat[TaxableLumpSumsAndCertainIncomeMandatory] = Json.format[TaxableLumpSumsAndCertainIncomeMandatory]
}