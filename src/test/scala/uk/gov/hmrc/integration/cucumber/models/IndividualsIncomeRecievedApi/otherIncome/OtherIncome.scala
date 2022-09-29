/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.otherIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class OtherIncome(submittedOn: StatefulFieldWrapper[String],
                       businessReceipts: Option[Seq[BusinessReceipts]],
                       allOtherIncomeReceivedWhilstAbroad: Option[Seq[AllOtherIncomeReceivedWhilstAbroad]],
                       overseasIncomeAndGains: Option[OverseasIncomeAndGains],
                       chargeableForeignBenefitsAndGifts: Option[ChargeableForeignBenefitsAndGifts],
                       omittedForeignIncome: Option[OmittedForeignIncome],
                       links: Option[Seq[HateoasLink]])

object OtherIncome {
  implicit val format: OFormat[OtherIncome] = Json.format[OtherIncome]
}
