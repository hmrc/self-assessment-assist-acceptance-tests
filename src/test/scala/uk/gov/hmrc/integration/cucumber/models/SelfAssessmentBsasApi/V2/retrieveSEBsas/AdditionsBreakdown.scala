/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class AdditionsBreakdown(costOfGoodsBoughtDisallowable: Option[BigDecimal],
                              cisPaymentsToSubcontractorsDisallowable: Option[BigDecimal],
                              staffCostsDisallowable: Option[BigDecimal],
                              travelCostsDisallowable: Option[BigDecimal],
                              premisesRunningCostsDisallowable: Option[BigDecimal],
                              maintenanceCostsDisallowable: Option[BigDecimal],
                              adminCostsDisallowable: Option[BigDecimal],
                              advertisingCostsDisallowable: Option[BigDecimal],
                              businessEntertainmentCostsDisallowable: Option[BigDecimal],
                              interestDisallowable: Option[BigDecimal],
                              financialChargesDisallowable: Option[BigDecimal],
                              badDebtDisallowable: Option[BigDecimal],
                              professionalFeesDisallowable: Option[BigDecimal],
                              depreciationDisallowable: Option[BigDecimal],
                              otherDisallowable: Option[BigDecimal])

object AdditionsBreakdown {
  implicit val format: OFormat[AdditionsBreakdown] = Json.format[AdditionsBreakdown]
}
