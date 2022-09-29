/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.taxCalculation.nics

import play.api.libs.json.{Json, OFormat}

case class Class2Nics(amount: Option[BigDecimal],
                      weeklyRate: Option[BigDecimal],
                      weeks: Option[BigInt],
                      limit: Option[BigInt],
                      apportionedLimit: Option[BigInt],
                      underSmallProfitThreshold: Boolean,
                      actualClass2Nic: Option[Boolean])

object Class2Nics {
  implicit val format: OFormat[Class2Nics] = Json.format[Class2Nics]
}