/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class SummaryCalculationExpenses(consolidatedExpenses: Option[BigDecimal],
                                      costOfGoodsAllowable: Option[BigDecimal],
                                      paymentsToSubcontractorsAllowable: Option[BigDecimal],
                                      wagesAndStaffCostsAllowable: Option[BigDecimal],
                                      carVanTravelExpensesAllowable: Option[BigDecimal],
                                      premisesRunningCostsAllowable: Option[BigDecimal],
                                      maintenanceCostsAllowable: Option[BigDecimal],
                                      adminCostsAllowable: Option[BigDecimal],
                                      interestOnBankOtherLoansAllowable: Option[BigDecimal],
                                      financeChargesAllowable: Option[BigDecimal],
                                      irrecoverableDebtsAllowable: Option[BigDecimal],
                                      professionalFeesAllowable: Option[BigDecimal],
                                      depreciationAllowable: Option[BigDecimal],
                                      otherExpensesAllowable: Option[BigDecimal],
                                      advertisingCostsAllowable: Option[BigDecimal],
                                      businessEntertainmentCostsAllowable: Option[BigDecimal])

object SummaryCalculationExpenses {
  implicit val format: OFormat[SummaryCalculationExpenses] = Json.format[SummaryCalculationExpenses]
}
