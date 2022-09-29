/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory

import play.api.libs.json.{Json, OFormat}

case class BenefitsInKindMandatory(totalBenefitsInKindReceived: BigDecimal,
                                   benefitsInKindDetail: BenefitsInKindDetailMandatory)

object BenefitsInKindMandatory {
  implicit val format: OFormat[BenefitsInKindMandatory] = Json.format[BenefitsInKindMandatory]
}