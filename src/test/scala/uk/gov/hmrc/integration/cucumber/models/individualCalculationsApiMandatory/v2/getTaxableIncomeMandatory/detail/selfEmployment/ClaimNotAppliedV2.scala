/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.getTaxableIncomeMandatory.detail.selfEmployment

import play.api.libs.json._

case class ClaimNotAppliedV2(claimId: String, taxYearClaimMade: String, claimType: String)

object ClaimNotAppliedV2 {
  implicit val format: OFormat[ClaimNotAppliedV2] = Json.format[ClaimNotAppliedV2]
}
