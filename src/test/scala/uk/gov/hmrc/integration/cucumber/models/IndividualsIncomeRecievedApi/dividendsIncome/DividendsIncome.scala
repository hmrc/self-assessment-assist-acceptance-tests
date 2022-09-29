/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.dividendsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class DividendsIncome(submittedOn: StatefulFieldWrapper[String],
                           foreignDividend: Option[Seq[ForeignDividend]],
                           dividendIncomeReceivedWhilstAbroad: Option[Seq[DividendIncomeReceivedWhilstAbroad]],
                           stockDividend: Option[CommonDividendsObject],
                           redeemableShares: Option[CommonDividendsObject],
                           bonusIssuesOfSecurities: Option[CommonDividendsObject],
                           closeCompanyLoansWrittenOff: Option[CommonDividendsObject],
                           links: Option[Seq[HateoasLink]])

object DividendsIncome {
  implicit val format: OFormat[DividendsIncome] = Json.format[DividendsIncome]
}
