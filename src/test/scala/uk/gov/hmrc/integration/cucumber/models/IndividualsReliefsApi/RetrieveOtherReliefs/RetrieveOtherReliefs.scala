/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveOtherReliefs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveOtherReliefs(submittedOn: String,
                                nonDeductibleLoanInterest: Option[NonDeductibleLoanInterest],
                                payrollGiving: Option[PayrollGiving],
                                qualifyingDistributionRedemptionOfSharesAndSecurities: Option[QualifyingDistributionRedemptionOfSharesAndSecurities],
                                maintenancePayments: Option[Seq[MaintenancePayments]],
                                postCessationTradeReliefAndCertainOtherLosses: Option[Seq[PostCessationTradeReliefAndCertainOtherLosses]],
                                annualPaymentsMade: Option[AnnualPaymentsMade],
                                qualifyingLoanInterestPayments: Option[Seq[QualifyingLoanInterestPayments]],
                                links: Seq[HateoasLink])

object RetrieveOtherReliefs {
  implicit val format: OFormat[RetrieveOtherReliefs] = Json.format[RetrieveOtherReliefs]
}
