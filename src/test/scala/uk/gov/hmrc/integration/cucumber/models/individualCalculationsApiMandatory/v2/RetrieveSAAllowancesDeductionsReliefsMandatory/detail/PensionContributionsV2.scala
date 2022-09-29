/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAAllowancesDeductionsReliefsMandatory.detail

import play.api.libs.json.{Json, OFormat}

case class PensionContributionsV2(totalPensionContributions: BigDecimal,
                                  retirementAnnuityPayments: BigDecimal,
                                  paymentToEmployersSchemeNoTaxRelief: BigDecimal,
                                  overseasPensionSchemeContributions: BigDecimal)

object PensionContributionsV2 {
  implicit val format: OFormat[PensionContributionsV2] = Json.format[PensionContributionsV2]
}
