/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.dividendsIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class DividendsIncomeMandatory(totalChargeableDividends: BigInt,
                                    totalUkDividends: BigInt,
                                    ukDividends: UkDividendsMandatory,
                                    otherDividends: Seq[OtherDividendsMandatory],
                                    chargeableForeignDividends: BigInt,
                                    foreignDividends: Seq[ForeignDividendsMandatory],
                                    dividendIncomeReceivedWhilstAbroad: Seq[DividendIncomeReceivedWhilstAbroadMandatory])

object DividendsIncomeMandatory {
  implicit val format: OFormat[DividendsIncomeMandatory] = Json.format[DividendsIncomeMandatory]
}