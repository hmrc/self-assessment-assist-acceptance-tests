/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfEmploymentBusinessApi.retrieveSEPeriodSummary

import play.api.libs.json.{Json, OFormat}

case class PeriodAllowableExpenses(consolidatedExpenses: Option[BigDecimal],
                                   costOfGoodsAllowable: Option[BigDecimal],
                                   paymentsToSubcontractorsAllowable: Option[BigDecimal],
                                   wagesAndStaffCostsAllowable: Option[BigDecimal],
                                   carVanTravelExpensesAllowable: Option[BigDecimal],
                                   premisesRunningCostsAllowable: Option[BigDecimal],
                                   maintenanceCostsAllowable: Option[BigDecimal],
                                   adminCostsAllowable: Option[BigDecimal],
                                   businessEntertainmentCostsAllowable: Option[BigDecimal],
                                   advertisingCostsAllowable: Option[BigDecimal],
                                   interestOnBankOtherLoansAllowable: Option[BigDecimal],
                                   financeChargesAllowable: Option[BigDecimal],
                                   irrecoverableDebtsAllowable: Option[BigDecimal],
                                   professionalFeesAllowable: Option[BigDecimal],
                                   depreciationAllowable: Option[BigDecimal],
                                   otherExpensesAllowable: Option[BigDecimal]
                                  )

object PeriodAllowableExpenses {
  implicit val format: OFormat[PeriodAllowableExpenses] = Json.format[PeriodAllowableExpenses]
}
