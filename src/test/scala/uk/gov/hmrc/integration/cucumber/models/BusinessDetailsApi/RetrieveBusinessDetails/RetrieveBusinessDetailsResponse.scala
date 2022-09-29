/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.RetrieveBusinessDetails

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveBusinessDetailsResponse(businessId: String,
                                           typeOfBusiness: String,
                                           tradingName: Option[String],
                                           accountingPeriods: Seq[AccountingPeriod],
                                           accountingType: String,
                                           commencementDate: String,
                                           cessationDate: Option[String],
                                           businessAddressLineOne: Option[String],
                                           businessAddressLineTwo: Option[String],
                                           businessAddressLineThree: Option[String],
                                           businessAddressLineFour: Option[String],
                                           businessAddressPostcode: Option[String],
                                           businessAddressCountryCode: Option[String],
                                           links: Seq[HateoasLink])

object RetrieveBusinessDetailsResponse {
  implicit val format: OFormat[RetrieveBusinessDetailsResponse] = Json.format[RetrieveBusinessDetailsResponse]
}
