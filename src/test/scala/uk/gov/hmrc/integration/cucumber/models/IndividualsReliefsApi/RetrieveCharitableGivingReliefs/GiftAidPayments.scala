/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveCharitableGivingReliefs

import play.api.libs.json.{Json, OFormat}

case class GiftAidPayments(nonUkCharities: Option[NonUkCharities],
                           totalAmount: Option[BigDecimal],
                           oneOffAmount: Option[BigDecimal],
                           amountTreatedAsPreviousTaxYear: Option[BigDecimal],
                           amountTreatedAsSpecifiedTaxYear: Option[BigDecimal])

object GiftAidPayments {
  implicit val format: OFormat[GiftAidPayments] = Json.format[GiftAidPayments]
}
