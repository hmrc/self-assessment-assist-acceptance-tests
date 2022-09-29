/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class AdjustmentsAdditions(costOfGoodsDisallowable: Option[BigDecimal],
                                paymentsToSubcontractorsDisallowable: Option[BigDecimal],
                                wagesAndStaffCostsDisallowable: Option[BigDecimal],
                                carVanTravelExpensesDisallowable: Option[BigDecimal],
                                premisesRunningCostsDisallowable: Option[BigDecimal],
                                maintenanceCostsDisallowable: Option[BigDecimal],
                                adminCostsDisallowable: Option[BigDecimal],
                                interestOnBankOtherLoansDisallowable: Option[BigDecimal],
                                financeChargesDisallowable: Option[BigDecimal],
                                irrecoverableDebtsDisallowable: Option[BigDecimal],
                                professionalFeesDisallowable: Option[BigDecimal],
                                depreciationDisallowable: Option[BigDecimal],
                                otherExpensesDisallowable: Option[BigDecimal],
                                advertisingCostsDisallowable: Option[BigDecimal],
                                businessEntertainmentCostsDisallowable: Option[BigDecimal])

object AdjustmentsAdditions {
  implicit val format: OFormat[AdjustmentsAdditions] = Json.format[AdjustmentsAdditions]
}
