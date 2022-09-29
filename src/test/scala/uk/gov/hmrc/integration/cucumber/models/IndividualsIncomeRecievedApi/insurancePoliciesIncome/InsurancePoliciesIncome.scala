/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.insurancePoliciesIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.Stateful.StatefulFieldWrapper
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class InsurancePoliciesIncome(submittedOn: StatefulFieldWrapper[String],
                                   lifeInsurance: Option[Seq[CommonPolicyObject]],
                                   capitalRedemption: Option[Seq[CommonPolicyObject]],
                                   lifeAnnuity: Option[Seq[CommonPolicyObject]],
                                   voidedIsa: Option[Seq[VoidedIsa]],
                                   foreign: Option[Seq[Foreign]],
                                   links: Seq[HateoasLink])

object InsurancePoliciesIncome {
  implicit val format: OFormat[InsurancePoliciesIncome] = Json.format[InsurancePoliciesIncome]
}
