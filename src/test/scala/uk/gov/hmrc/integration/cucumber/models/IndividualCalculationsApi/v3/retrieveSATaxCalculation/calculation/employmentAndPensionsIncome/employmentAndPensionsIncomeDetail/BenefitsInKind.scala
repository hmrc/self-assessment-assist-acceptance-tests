/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.employmentAndPensionsIncome.employmentAndPensionsIncomeDetail

import play.api.libs.json.{Json, OFormat}

case class BenefitsInKind(totalBenefitsInKindReceived: Option[BigDecimal],
                          benefitsInKindDetail: Option[BenefitsInKindDetail])

object BenefitsInKind {
  implicit val format: OFormat[BenefitsInKind] = Json.format[BenefitsInKind]
}