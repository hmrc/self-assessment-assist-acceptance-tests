/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherEmploymentIncome

import play.api.libs.json.{Json, OFormat}

case class BenefitFromEmployerFinancedRetirementSchemeItem(amount: BigDecimal,
                                                           exemptAmount: Option[BigDecimal],
                                                           taxPaid: Option[BigDecimal],
                                                           taxTakenOffInEmployment: Boolean)

object BenefitFromEmployerFinancedRetirementSchemeItem {
  implicit val format: OFormat[BenefitFromEmployerFinancedRetirementSchemeItem] = Json.format[BenefitFromEmployerFinancedRetirementSchemeItem]

}
