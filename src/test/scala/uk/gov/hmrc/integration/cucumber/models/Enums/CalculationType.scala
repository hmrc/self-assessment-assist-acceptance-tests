/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait CalculationType

object CalculationType {
  case object `inYear`           extends CalculationType
  case object `finalDeclaration` extends CalculationType
  case object `biss`             extends CalculationType

  implicit val structureExtractor: ModelStructureExtractor[CalculationType] =
    ModelStructureExtractor.primitive

  implicit val format: Format[CalculationType]         = Enums.format[CalculationType]
  val parser: PartialFunction[String, CalculationType] = Enums.parser[CalculationType]
}
