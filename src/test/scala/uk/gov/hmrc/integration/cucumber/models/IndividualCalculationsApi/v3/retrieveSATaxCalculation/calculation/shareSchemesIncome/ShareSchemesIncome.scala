/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveSATaxCalculation.calculation.shareSchemesIncome

import play.api.libs.json.{Json, OFormat}

case class ShareSchemesIncome(totalIncome: BigDecimal,
                              shareSchemeDetail: Option[Seq[ShareSchemeDetail]])

object ShareSchemesIncome {
  implicit val format: OFormat[ShareSchemesIncome] = Json.format[ShareSchemesIncome]
}