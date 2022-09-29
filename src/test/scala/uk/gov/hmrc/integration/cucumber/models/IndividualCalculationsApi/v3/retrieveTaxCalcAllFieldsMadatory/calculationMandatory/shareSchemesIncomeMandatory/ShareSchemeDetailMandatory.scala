/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.shareSchemesIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ShareSchemeDetailMandatory(`type`: String,
                                      employerName: String,
                                      employerRef: String,
                                      taxableAmount: BigDecimal)

object ShareSchemeDetailMandatory {
  implicit val format: OFormat[ShareSchemeDetailMandatory] = Json.format[ShareSchemeDetailMandatory]
}