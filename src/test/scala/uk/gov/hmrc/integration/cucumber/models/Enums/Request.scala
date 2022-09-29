/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait Request

object Request {
  case object `customer`   extends Request
  case object `hmrc`       extends Request
  case object `agent`      extends Request

  implicit val structureExtractor: ModelStructureExtractor[Request] =
    ModelStructureExtractor.primitive

  implicit val format: Format[Request]         = Enums.format[Request]
  val parser: PartialFunction[String, Request] = Enums.parser[Request]
}


