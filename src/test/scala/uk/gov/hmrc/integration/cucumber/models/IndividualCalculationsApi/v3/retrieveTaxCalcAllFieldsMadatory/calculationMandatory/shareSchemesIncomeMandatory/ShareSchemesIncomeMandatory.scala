/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.shareSchemesIncomeMandatory

import play.api.libs.json.{Json, OFormat}

case class ShareSchemesIncomeMandatory(totalIncome: BigDecimal,
                                       shareSchemeDetail: Seq[ShareSchemeDetailMandatory])

object ShareSchemesIncomeMandatory {
  implicit val format: OFormat[ShareSchemesIncomeMandatory] = Json.format[ShareSchemesIncomeMandatory]
}