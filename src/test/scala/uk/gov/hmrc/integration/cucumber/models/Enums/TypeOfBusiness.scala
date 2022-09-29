/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait TypeOfBusiness

object TypeOfBusiness {
  case object `self-employment`          extends TypeOfBusiness
  case object `uk-property`              extends TypeOfBusiness
  case object `foreign-property`         extends TypeOfBusiness
  case object `foreign-property-fhl-eea` extends TypeOfBusiness

  implicit val structureExtractor: ModelStructureExtractor[TypeOfBusiness] =
    ModelStructureExtractor.primitive

  implicit val format: Format[TypeOfBusiness]         = Enums.format[TypeOfBusiness]
  val parser: PartialFunction[String, TypeOfBusiness] = Enums.parser[TypeOfBusiness]
}
