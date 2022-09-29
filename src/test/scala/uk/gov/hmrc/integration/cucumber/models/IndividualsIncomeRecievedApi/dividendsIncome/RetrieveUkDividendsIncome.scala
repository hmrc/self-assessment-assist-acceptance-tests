/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.dividendsIncome

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveUkDividendsIncome(ukDividends: Option[BigDecimal],
                                     otherUkDividends: Option[BigDecimal],
                                     links: Option[Seq[HateoasLink]])

object RetrieveUkDividendsIncome {
  implicit val format: OFormat[RetrieveUkDividendsIncome] = Json.format[RetrieveUkDividendsIncome]
}
