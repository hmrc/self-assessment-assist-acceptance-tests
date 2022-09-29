/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary

import play.api.libs.json.{Json, OFormat}

case class PeriodDisallowableExpenses(costOfGoodsDisallowable: Option[BigDecimal],
                                      paymentsToSubcontractorsDisallowable: Option[BigDecimal],
                                      wagesAndStaffCostsDisallowable: Option[BigDecimal],
                                      carVanTravelExpensesDisallowable: Option[BigDecimal],
                                      premisesRunningCostsDisallowable: Option[BigDecimal],
                                      maintenanceCostsDisallowable: Option[BigDecimal],
                                      adminCostsDisallowable: Option[BigDecimal],
                                      businessEntertainmentCostsDisallowable: Option[BigDecimal],
                                      advertisingCostsDisallowable: Option[BigDecimal],
                                      interestOnBankOtherLoansDisallowable: Option[BigDecimal],
                                      financeChargesDisallowable: Option[BigDecimal],
                                      irrecoverableDebtsDisallowable: Option[BigDecimal],
                                      professionalFeesDisallowable: Option[BigDecimal],
                                      depreciationDisallowable: Option[BigDecimal],
                                      otherExpensesDisallowable: Option[BigDecimal]
                                     )

object PeriodDisallowableExpenses {
  implicit val format: OFormat[PeriodDisallowableExpenses] = Json.format[PeriodDisallowableExpenses]
}
