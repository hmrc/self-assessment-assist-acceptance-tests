/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class Bsas(total: Total,
                accountingAdjustments: Option[BigDecimal],
                profit: Option[Profit],
                loss: Option[Loss],
                incomeBreakdown: Option[IncomeBreakdown],
                expensesBreakdown: Option[ExpensesBreakdown],
                additionsBreakdown: Option[AdditionsBreakdown])

object Bsas {
  implicit val format: OFormat[Bsas] = Json.format[Bsas]
}
