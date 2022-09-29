/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.capitalGainsTax

import play.api.libs.json.{Json, OFormat}

case class Disposals(assetType: String,
                     assetDescription: String,
                     acquisitionDate: String,
                     disposalDate: String,
                     disposalProceeds: BigDecimal,
                     allowableCosts: BigDecimal,
                     gain: Option[BigDecimal],
                     loss: Option[BigDecimal],
                     claimOrElectionCodes: Option[Seq[String]],
                     gainAfterRelief: Option[BigDecimal],
                     lossAfterRelief: Option[BigDecimal],
                     rttTaxPaid: Option[BigDecimal])

object Disposals {
  implicit val format: OFormat[Disposals] = Json.format[Disposals]
}
