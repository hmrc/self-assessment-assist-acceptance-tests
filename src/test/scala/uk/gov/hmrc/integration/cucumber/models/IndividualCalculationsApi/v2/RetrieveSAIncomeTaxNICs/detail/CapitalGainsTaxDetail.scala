/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail

import play.api.libs.json.{Json, OFormat}

case class CapitalGainsTaxDetail(businessAssetsDisposalsAndInvestorsRel: Option[BusinessAssetsDisposalsAndInvestorsRel],
                                 residentialPropertyAndCarriedInterest: Option[ResidentialPropertyAndCarriedInterest],
                                 otherGains: Option[OtherGains])

object CapitalGainsTaxDetail {
  implicit val format: OFormat[CapitalGainsTaxDetail] = Json.format[CapitalGainsTaxDetail]
}
