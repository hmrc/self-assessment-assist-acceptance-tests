/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait Status

object Status {
  case object `valid`      extends Status
  case object `invalid`    extends Status
  case object `superseded` extends Status

  implicit val structureExtractor: ModelStructureExtractor[Status] =
    ModelStructureExtractor.primitive

  implicit val format: Format[Status]         = Enums.format[Status]
  val parser: PartialFunction[String, Status] = Enums.parser[Status]
}
