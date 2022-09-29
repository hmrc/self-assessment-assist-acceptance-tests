/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory

import play.api.libs.json.{Json, OFormat}

case class ReliefClaimedDetailMandatory(amountClaimed: BigDecimal,
                                        uniqueInvestmentRef: String,
                                        name: String,
                                        socialEnterpriseName: String,
                                        companyName: String,
                                        deficiencyReliefType: String,
                                        customerReference: String)

object ReliefClaimedDetailMandatory {
  implicit val format: OFormat[ReliefClaimedDetailMandatory] = Json.format[ReliefClaimedDetailMandatory]
}