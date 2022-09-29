/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V2.retrieveSEBsas

import play.api.libs.json.{Json, OFormat}

case class Loss(net: Option[BigDecimal], adjustedIncomeTax: Option[BigDecimal])

object Loss {
  implicit val format: OFormat[Loss] = Json.format[Loss]
}
