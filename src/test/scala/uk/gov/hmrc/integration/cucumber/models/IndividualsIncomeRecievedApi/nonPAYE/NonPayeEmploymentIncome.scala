/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.nonPAYE

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class NonPayeEmploymentIncome(submittedOn: String,
                                   source: String,
                                   totalNonPayeIncome: Option[BigDecimal],
                                   nonPayeIncome: Option[NonPayeIncome],
                                   links: Seq[HateoasLink])

object NonPayeEmploymentIncome {
  implicit val format: OFormat[NonPayeEmploymentIncome] = Json.format[NonPayeEmploymentIncome]
}
