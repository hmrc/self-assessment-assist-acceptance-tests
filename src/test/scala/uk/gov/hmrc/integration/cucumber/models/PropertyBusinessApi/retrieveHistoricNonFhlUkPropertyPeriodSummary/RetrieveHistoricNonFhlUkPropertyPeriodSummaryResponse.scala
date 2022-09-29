/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.PropertyBusinessApi.retrieveHistoricNonFhlUkPropertyPeriodSummary

import play.api.libs.json.{Format, Json, OFormat}

case class RentARoomIncome(rentsReceived: Option[BigDecimal])

case object RentARoomIncome {
  implicit val format: OFormat[RentARoomIncome] = Json.format[RentARoomIncome]
}

case class RentARoomExpenses(amountClaimed: Option[BigDecimal])

case object RentARoomExpenses {
  implicit val format: OFormat[RentARoomExpenses] = Json.format[RentARoomExpenses]
}

case class PeriodIncome(periodAmount: Option[BigDecimal],
                        premiumsOfLeaseGrant: Option[BigDecimal],
                        reversePremiums: Option[BigDecimal],
                        otherIncome: Option[BigDecimal],
                        taxDeducted: Option[BigDecimal],
                        rentARoom: Option[RentARoomIncome])

object PeriodIncome{
  implicit val format: Format[PeriodIncome] = Json.format
}

case class PeriodExpenses(premisesRunningCosts: Option[BigDecimal],
                          repairsAndMaintenance: Option[BigDecimal],
                          financialCosts: Option[BigDecimal],
                          professionalFees: Option[BigDecimal],
                          costOfServices: Option[BigDecimal],
                          other: Option[BigDecimal],
                          consolidatedExpenses: Option[BigDecimal],
                          travelCosts: Option[BigDecimal],
                          residentialFinancialCost: Option[BigDecimal],
                          residentialFinancialCostsCarriedForward: Option[BigDecimal],
                          rentARoom: Option[RentARoomExpenses])

object PeriodExpenses{
  implicit val format: Format[PeriodExpenses] = Json.format
}

case class RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse(fromDate: String,
                                                            toDate: String,
                                                            income: Option[PeriodIncome],
                                                            expenses: Option[PeriodExpenses])


object RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse {
  implicit  val format: Format[RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse] = Json.format
}