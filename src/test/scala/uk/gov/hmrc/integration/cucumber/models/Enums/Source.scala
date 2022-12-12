/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait Source

object Source {
  case object `MTD-SA` extends Source

  implicit val structureExtractor: ModelStructureExtractor[Source] =
    ModelStructureExtractor.primitive

  implicit val format: Format[Source]         = Enums.format[Source]
  val parser: PartialFunction[String, Source] = Enums.parser[Source]

}
