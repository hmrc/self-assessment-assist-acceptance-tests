/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.pensionsIncome

import play.api.libs.json.{Json, OFormat}

case class OverseasPensionContributions(customerReference: Option[String],
                                        exemptEmployersPensionContribs: BigDecimal,
                                        migrantMemReliefQopsRefNo: Option[String],
                                        dblTaxationRelief: Option[BigDecimal],
                                        dblTaxationCountryCode: Option[String],
                                        dblTaxationArticle: Option[String],
                                        dblTaxationTreaty: Option[String],
                                        sf74reference: Option[String])

object OverseasPensionContributions {
  implicit val format: OFormat[OverseasPensionContributions] = Json.format[OverseasPensionContributions]
}
