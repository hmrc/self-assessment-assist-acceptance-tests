/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.CisDeductionsApi

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveCisDeductions(totalDeductionAmount: BigDecimal,
                                 totalCostOfMaterials: BigDecimal,
                                 totalGrossAmountPaid: BigDecimal,
                                 cisDeductions: Seq[CisDeductions],
                                 links: Seq[HateoasLink])

object RetrieveCisDeductions {
  implicit val writes: OFormat[RetrieveCisDeductions] = Json.format[RetrieveCisDeductions]
}
