/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.reliefsMandatory.residentialFinanceCostsMandatory

import play.api.libs.json.{Json, OFormat}

case class ForeignPropertyMandatory(totalForeignPropertyAllowableAmount: BigDecimal,
                                    foreignPropertyRfcDetail: Seq[ForeignPropertyRfcDetailMandatory])

object ForeignPropertyMandatory {
  implicit val format: OFormat[ForeignPropertyMandatory] = Json.format[ForeignPropertyMandatory]
}
