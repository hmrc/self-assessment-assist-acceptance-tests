/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsStateBenefitsApi.listBenefits

import play.api.libs.json.{Json, OFormat}

case class StateBenefit(benefitType: String,
                        dateIgnored: Option[String] = None,
                        submittedOn: Option[String],
                        benefitId: String,
                        startDate: String,
                        endDate: Option[String],
                        amount: Option[BigDecimal],
                        taxPaid: Option[BigDecimal])

object StateBenefit {
  implicit val formatStateBenefits: OFormat[StateBenefit] = Json.format[StateBenefit]
}
